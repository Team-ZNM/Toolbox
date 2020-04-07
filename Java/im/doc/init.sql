SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------

-- Table structure for user

-- ----------------------------

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (

`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id，主键',

`use_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',

`password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户密码',

PRIMARY KEY (`id`) USING BTREE

) ENGINE = MyISAM AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------

-- Records of user

-- ----------------------------

INSERT INTO `user` VALUES (1, 'wbliu', 'wbliu');

INSERT INTO `user` VALUES (2, 'wbliu001', 'wbliu001');

SET FOREIGN_KEY_CHECKS = 1;