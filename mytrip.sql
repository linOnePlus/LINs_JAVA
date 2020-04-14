/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3306
 Source Schema         : mytrip

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 11/06/2019 18:47:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for desc
-- ----------------------------
DROP TABLE IF EXISTS `desc`;
CREATE TABLE `desc`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(150) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `image` mediumblob NULL COMMENT '景点照片',
  `desc` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '景点描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(35) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `repassword` varchar(35) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `number` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', 'admin', 'admin', '110', '1026392686@qq.com');
INSERT INTO `user` VALUES (2, '12345', 'asdasd', 'asdasd', '15119451579', 'asd@qq.com');
INSERT INTO `user` VALUES (7, '102633@qq.com', 'asdasd', 'asdasd', '15119451579', 'asd@qq.com');
INSERT INTO `user` VALUES (8, '1234567', 'asdasd', 'asdasd', '15119451579', 'asd@qq.com');
INSERT INTO `user` VALUES (10, 'qwe', 'qweqwe', 'qweqwe', '15119451579', '1026392686@qq.com');
INSERT INTO `user` VALUES (11, '123456', 'asdasd', 'asdasd', '15119451579', 'asd@qq.com');
INSERT INTO `user` VALUES (12, 'admin', 'asdasd', 'asdasd', '15119451579', 'asd@qq.com');
INSERT INTO `user` VALUES (13, '123456', '123456', '123456', '15119451579', 'asd@qq.com');

SET FOREIGN_KEY_CHECKS = 1;
