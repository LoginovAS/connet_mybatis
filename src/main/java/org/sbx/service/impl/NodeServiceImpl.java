package org.sbx.service.impl;

import org.sbx.entity.Node;
import org.sbx.mappers.NodeMapper;
import org.sbx.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by loginov_a_s on 23.08.2017.
 */
public class NodeServiceImpl implements NodeService {

    @Autowired
    private NodeMapper mapper;

    @Override
    public List<Node> getAllNodes() {
        return mapper.getAllNodes();
    }

    @Override
    public Node getNodeById(int id) {
        return mapper.getNodeById(id);
    }

    @Override
    public void createNode(Node node) {
        mapper.insertNode(node);
    }

    @Override
    public void updateNode(Node node) {
        mapper.updateNode(node);
    }

    @Override
    public void deleteNode(int id) {
        mapper.deleteNode(id);
    }
}
