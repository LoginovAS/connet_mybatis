package org.sbx.controller;

import org.sbx.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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



}
