


JdbcTemplate新刪改查


-- testdb.jdbc_test definition

CREATE TABLE `jdbc_test` (
  `ds_id` int NOT NULL AUTO_INCREMENT,
  `ds_type` varchar(100) DEFAULT NULL,
  `ds_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ds_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO testdb.jdbc_test (ds_type,ds_name) VALUES
	 ('com.zaxxer.hikari.HiariDataSource','hikari資料源'),
	 ('org.apache.commons.dbcp2.BasicDataSource','dbcp2資料源'),
	 ('type_1843p','name_b1nfb');





Mybatis新刪改查


-- testdb.tb_user definition

CREATE TABLE `tb_user` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主鍵',
  `name` varchar(100) NOT NULL COMMENT '登錄名',
  `password` varchar(100) NOT NULL COMMENT '密碼',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO testdb.tb_user (name,password) VALUES
	 ('spring boot','123456'),
	 ('MyBatis','123456'),
	 ('Thymeleaf','123456'),
	 ('Java','123456'),
	 ('MySQL','123456'),
	 ('IDEA','123456');

