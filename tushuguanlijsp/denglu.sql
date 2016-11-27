/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : guanliyuan

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2015-12-31 08:42:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `denglu`
-- ----------------------------
DROP TABLE IF EXISTS `denglu`;
CREATE TABLE `denglu` (
  `name` varchar(20) NOT NULL DEFAULT '',
  `pwd` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of denglu
-- ----------------------------
INSERT INTO `denglu` VALUES ('aaa', '111');
INSERT INTO `denglu` VALUES ('bbb', '222');
INSERT INTO `denglu` VALUES ('ccc', '333');
