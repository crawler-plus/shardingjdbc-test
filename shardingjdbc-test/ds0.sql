/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : ds0

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-12-06 18:12:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `phone_201712`
-- ----------------------------
DROP TABLE IF EXISTS `phone_201712`;
CREATE TABLE `phone_201712` (
  `id` varchar(40) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `phone_num` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL,
  `datetime` varchar(6) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of phone_201712
-- ----------------------------

-- ----------------------------
-- Table structure for `phone_201801`
-- ----------------------------
DROP TABLE IF EXISTS `phone_201801`;
CREATE TABLE `phone_201801` (
  `id` varchar(40) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `phone_num` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL,
  `datetime` varchar(6) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of phone_201801
-- ----------------------------
