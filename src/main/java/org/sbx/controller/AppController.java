package org.sbx.controller;

import org.sbx.entity.Node;
import org.sbx.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {

    @Autowired
    private NodeService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public void index(Model model) {
        model.addAttribute("welcome", "Welcome!");
    }

    @RequestMapping(value = "/nodes", method = RequestMethod.GET)
    public void nodes(Model model) {
        model.addAttribute("nodes", service.getAllNodes());
    }

    @RequestMapping(value = "/node/{id}")
    public String node(@PathVariable("id") int id, Model model) {

        model.addAttribute("node", service.getNodeById(id));
        return "node";

    }

    @RequestMapping(value = "/node/add", method = RequestMethod.GET)
    public String nodeAdd(Model model) {
        model.addAttribute("node", new Node());
        return "newNodeForm";
    }

    @RequestMapping(value = "/node/add", method = RequestMethod.POST)
    public String nodeAdd(@ModelAttribute("node")Node node) {
        if (node.getNodeId() == 0) {
            service.createNode(node);
        } else {
            service.updateNode(node);
        }

        return "nodes";
    }



}
