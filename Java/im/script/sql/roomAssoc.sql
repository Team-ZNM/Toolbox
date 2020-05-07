/*
 Navicat Premium Data Transfer

 Source Server         : bmysql
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : 106.13.37.185:3306
 Source Schema         : im

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 07/05/2020 19:29:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for roomAssoc
-- ----------------------------
DROP TABLE IF EXISTS `roomAssoc`;
CREATE TABLE `roomAssoc`  (
  `id` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '关系编号',
  `state` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态 是否被使用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
