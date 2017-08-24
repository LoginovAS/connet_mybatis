package org.sbx.mappers;

import org.sbx.entity.Node;

import java.util.List;

public interface NodeMapper {

    Node getNodeById(int id);

    List<Node> getAllNodes();

    void insertNode(Node node);
    void updateNode(Node node);
    void deleteNode(int id);

}
