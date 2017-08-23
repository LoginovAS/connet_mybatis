package org.sbx;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.sbx.config.DatabaseConfig;
import org.sbx.entity.Node;
import org.sbx.mappers.NodeMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by loginov_a_s on 23.08.2017.
 */
public class App {
    public static void main(String[] args) throws IOException {
//        List<Node> nodes = null;
//        Node node = null;
//        SqlSessionFactory sqlSessionFactory;
//        NodeMapper nodeMapper;
//        try (Reader reader = Resources.getResourceAsReader("mybatis-config.xml")) {
//            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//            nodeMapper = sqlSessionFactory.openSession().getMapper(NodeMapper.class);
//            nodes = nodeMapper.getAllNodes();
//            node = nodeMapper.getNodeById(2);
//        } catch (IOException ex) {
//            throw ex;
//        }
//
//        if (nodes != null) {
//            System.out.println("All nodes: ");
//            for (Node n: nodes) {
//                System.out.println(n);
//            }
//        }
//
//        if (node != null) {
//            System.out.println("Node by ID:");
//            System.out.println(node);
//        }
    }
}
