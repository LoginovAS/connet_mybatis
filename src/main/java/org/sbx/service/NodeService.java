package org.sbx.service;

import org.sbx.entity.Node;

import java.util.List;

/**
 * Created by loginov_a_s on 23.08.2017.
 */
public interface NodeService {
    List<Node> getAllNodes();
    Node getNodeById(int id);
    void createNode(Node node);
    void updateNode(Node node);
}
