-- nodes
CREATE TABLE IF NOT EXISTS `nodes` (
  `node_id` SERIAL,
  `node_name` varchar(255) NOT NULL,
  `region` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `building` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`node_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- nodes
INSERT INTO `nodes` (`node_id`, `node_name`, `region`, `street`, `building`) VALUES
	(2, 'TestNode1', 'Санкт-Петербург', 'Невский проспект', '11 лит А'),
	(3, 'TestNode2', 'Санкт-Петербург', 'Есенина', '4'),
	(4, 'TestNode3', 'Санкт-Петербург', 'Композиторов', '15к1'),
	(5, 'TestNode4', 'Москва', 'Кожевническая', '7/1'),
	(6, 'TestNode5', 'Москва', 'Большая Садовая', '10');