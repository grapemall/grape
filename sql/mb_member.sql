/*
 Navicat Premium Data Transfer

 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : grape_member

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 11/04/2020 15:13:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for mb_member
-- ----------------------------
DROP TABLE IF EXISTS `mb_member`;
CREATE TABLE `mb_member` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `mobile` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '手机号',
  `member_name` varchar(50) COLLATE utf8mb4_bin NOT NULL COMMENT '用户名',
  `member_pwd` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '登录密码',
  `member_sex` tinyint(1) DEFAULT NULL COMMENT '性别',
  `avatar` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '头像',
  `state` tinyint(1) DEFAULT NULL COMMENT '会员状态',
  `allow_buy` tinyint(1) DEFAULT NULL COMMENT '会员是否有购买权限',
  `member_points` bigint(20) DEFAULT NULL COMMENT '会员积分',
  `register_time` datetime DEFAULT NULL COMMENT '注册时间',
  `login_time` datetime DEFAULT NULL COMMENT '登录时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `INDEX_MEMBER_NAME_UNIQUE` (`member_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

SET FOREIGN_KEY_CHECKS = 1;
