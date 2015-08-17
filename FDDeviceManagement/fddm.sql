/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : fddm

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001
*/
DROP DATABASE IF EXISTS `fddm`;
create database fddm;
Use fddm;
SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `devicecheckinout`
-- ----------------------------
DROP TABLE IF EXISTS `devicecheckinout`;
CREATE TABLE `devicecheckinout` (
  `checkid` int(11) NOT NULL AUTO_INCREMENT,
  `deviceid` int(11) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `checkouttime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `checkintime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `takehome` boolean NOT NULL DEFAULT FALSE ,
  PRIMARY KEY (`checkid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of devicecheckinout
-- ----------------------------
INSERT INTO `devicecheckinout` (checkid, deviceid, userid) VALUES (1,1,1);

-- ----------------------------
-- Table structure for `device`
-- ----------------------------
DROP TABLE IF EXISTS `device`;
CREATE TABLE `device` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `brand` varchar(200) DEFAULT NULL,
  `type` varchar(200) DEFAULT NULL,
  `model` varchar(200) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `os` varchar(200) DEFAULT NULL,
  `charge` varchar(200) DEFAULT "YES",
  `cable` varchar(200) DEFAULT "YES",
  `browser` varchar(200) DEFAULT NULL,
  `intime` date DEFAULT NULL,
  `decommissiontime` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of device
-- ----------------------------
INSERT INTO `device` (id, brand, type, model, name, os, charge, browser) VALUES ('1', 'Sumsang', 'Tablet', 'Galaxy Tab', 'GalTab-001', 'Android 3.1(HoneyComb)', "NO", "Native (Browser)");
INSERT INTO `device` (id, brand, type, model, name, os, charge, browser) VALUES ('2', 'Sumsang', 'Tablet', 'Galaxy Tab', 'GalTab-002', 'Android 3.1(HoneyComb)', "NO", "Native (Browser)");
INSERT INTO `device` (id, brand, type, model, name, os, browser) VALUES ('3', 'Sumsang', 'Tablet', 'Galaxy Tab', 'Galaxy Tab-003', 'Android 4.2.2', "Native (Browser)");
INSERT INTO `device` (id, brand, type, model, name, os, browser) VALUES ('4', 'Apple', 'Tablet', 'IPad', 'IPad-001', 'IOS7.0', "Native (Safari)");
INSERT INTO `device` (id, brand, type, model, name, os, browser) VALUES ('5', 'Apple', 'Tablet', 'IPad', 'IPad-002', 'IOS7.1.2', "Native (Safari)");
INSERT INTO `device` (id, brand, type, model, name, os, browser) VALUES ('6', 'Apple', 'Tablet', 'IPad', 'IPad-003', 'IOS7.0', "Native (Safari)");
INSERT INTO `device` (id, brand, type, model, name, os, browser) VALUES ('7', 'Apple', 'Tablet', 'IPad Mini', 'IPad mini-001', 'IOS8.0.2', "Native (Safari)");
INSERT INTO `device` (id, brand, type, model, name, os,charge, cable, browser) VALUES ('8', 'Apple', 'Touch', 'ITouch', 'Itouch-001', 'IOS6.1.6', "NO", "NO", "Native (Safari)");
INSERT INTO `device` (id, brand, type, model, name, os, browser) VALUES ('9', 'Apple', 'Phone', 'IPhone 4S', 'IPhone-002', 'IOS7.0', "Native (Safari)");
INSERT INTO `device` (id, brand, type, model, name, os, browser) VALUES ('10', 'Apple', 'Phone', 'IPhone 4S', 'IPhone-003', 'IOS7.0', "Native (Safari)");

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  `role` varchar(200) NOT NULL DEFAULT 'normal',
  `project` varchar(200) NOT NULL DEFAULT 'FordDirect',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` (id,name,password,role) VALUES (1,'Hannah','1234','admin');
INSERT INTO `user`  (id,name,password) VALUES (2,'Zoe','1234');
-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;



-- ----------------------------
-- Foreign key reference
-- ----------------------------
ALTER TABLE devicecheckinout ADD FOREIGN KEY devicecheckinout_userid(userid) references user(id);
ALTER TABLE devicecheckinout ADD FOREIGN KEY devicecheckinout_deviceid(deviceid) references device(id);

--SET FOREIGN_KEY_CHECKS = 0;