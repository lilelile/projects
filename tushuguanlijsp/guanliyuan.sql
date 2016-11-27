/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : tushu

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2016-01-05 20:18:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for guanliyuan
-- ----------------------------
DROP TABLE IF EXISTS `guanliyuan`;
CREATE TABLE `guanliyuan` (
  `Aid` int(8) NOT NULL DEFAULT '0',
  `Aname` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `Atel` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of guanliyuan
-- ----------------------------
INSERT INTO `guanliyuan` VALUES ('1001', '李白', 'aaa', '18588889999');
INSERT INTO `guanliyuan` VALUES ('1002', 'zhao', 'bbb', '13222225555');
