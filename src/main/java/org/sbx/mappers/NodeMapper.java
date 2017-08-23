package org.sbx.mappers;

import org.sbx.entity.Node;

import java.util.List;

/**
 * Created by loginov_a_s on 23.08.2017.
 */
public interface NodeMapper {

    Node getNodeById(int id);

    List<Node> getAllNodes();

    void insertNode(Node node);
    void updateNode(Node node);
    void deleteNode(int id);

}
