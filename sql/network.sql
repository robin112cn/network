/*
Navicat MySQL Data Transfer

Source Server         : localhost3307
Source Server Version : 50621
Source Host           : localhost:3307
Source Database       : network

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2015-08-13 17:12:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for apply_info
-- ----------------------------
DROP TABLE IF EXISTS `apply_info`;
CREATE TABLE `apply_info` (
  `user_id` int(11) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_email` varchar(255) DEFAULT NULL,
  `device_name` varchar(255) DEFAULT NULL,
  `device_use` varchar(255) DEFAULT NULL,
  `oper_os` varchar(255) DEFAULT NULL,
  `device_mac` varchar(255) DEFAULT NULL,
  `device_type` varchar(255) DEFAULT NULL,
  `unti_time` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of apply_info
-- ----------------------------
INSERT INTO `apply_info` VALUES ('1', '张三', '3547841@qq.com', '笔记本', '学习', 'WIN7', '78:83:39:6C:EF', '有线网络', '2015/12/01');
INSERT INTO `apply_info` VALUES ('2', '李四', 'test@gmail.com', '手机', '会议', 'Android', '5F:DF:7E:60:87', '无线网络', '2015/10/22');

-- ----------------------------
-- Table structure for base_fields
-- ----------------------------
DROP TABLE IF EXISTS `base_fields`;
CREATE TABLE `base_fields` (
  `FIELD_ID` varchar(32) NOT NULL COMMENT '主键',
  `EN_FIELD_NAME` varchar(64) NOT NULL COMMENT '字典数据的字段英文名称',
  `FIELD_NAME` varchar(128) NOT NULL COMMENT '字段名称（中文名称）',
  `VALUE_FIELD` varchar(128) NOT NULL COMMENT '字段值',
  `DISPLAY_FIELD` varchar(128) NOT NULL COMMENT '字段显示值',
  `ENABLED_STATUS` int(2) NOT NULL DEFAULT '0' COMMENT '0：启用；1：停用',
  `FIELD_SORT` int(2) DEFAULT NULL COMMENT '排序（页面显示的排序）',
  PRIMARY KEY (`FIELD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_fields
-- ----------------------------
INSERT INTO `base_fields` VALUES ('43540def9e6249188626f3163da866b5', 'TR_FLAG', 'TR状态', '01', '未审批', '0', '2');
INSERT INTO `base_fields` VALUES ('59877438a67b4f7fbb50f4ba4d02ae57', 'TOKEN_FLAG', 'Token状态', '0', '已注销', '0', '2');
INSERT INTO `base_fields` VALUES ('679cacfb0dc047048031ea1e4672b8be', 'TR_FLAG', 'TR状态', '03', '审核不通过', '0', '4');
INSERT INTO `base_fields` VALUES ('690587cd81bc443c8b3aa17fc967713f', 'TR_FLAG', 'TR状态', '04', '注销', '0', '5');
INSERT INTO `base_fields` VALUES ('70e5402bdc654ec59c77612e51524877', 'TOKEN_FLAG', 'Token状态', '1', '正常', '0', '1');
INSERT INTO `base_fields` VALUES ('72ccbe7e3af64ac5a9712a52f1344c40', '测试', '测试', '测试', '测试', '0', '1');
INSERT INTO `base_fields` VALUES ('7adb737f549e4e31ae8afbf0084fbc84', 'PERIOD', '统计周期', '0', '按日统计', '0', '1');
INSERT INTO `base_fields` VALUES ('7b3c2f67ada44cd1a4c8f88ca4575d2d', 'TR_FLAG', 'TR状态', '02', '审核通过', '0', '3');
INSERT INTO `base_fields` VALUES ('8a16b70bce4e4f4ea9f9bb2d9320023b', 'PERIOD', '统计周期', '2', '按季统计', '0', '3');
INSERT INTO `base_fields` VALUES ('8cf4373bc2fa4da4b85462ed983bf8c8', 'test', 'test', 'test', 'test', '0', '1');
INSERT INTO `base_fields` VALUES ('a3a261f634334f0e85f1538f7c29d24c', 'PERIOD', '统计周期', '1', '按月统计', '0', '2');
INSERT INTO `base_fields` VALUES ('e67324a045414e4792d6492da11e9c93', 'TR_FLAG', 'TR状态', '00', '待注册', '1', '1');
INSERT INTO `base_fields` VALUES ('e944fea893e743c190d9c23107851cc6', '审核', '审核', '审核', '审核', '0', '2');
INSERT INTO `base_fields` VALUES ('f2a609035df0406385544bcf48519533', 'PERIOD', '统计周期', '3', '按年统计', '0', '4');

-- ----------------------------
-- Table structure for base_modules
-- ----------------------------
DROP TABLE IF EXISTS `base_modules`;
CREATE TABLE `base_modules` (
  `MODULE_ID` varchar(32) NOT NULL COMMENT '主键',
  `MODULE_NAME` varchar(64) NOT NULL COMMENT '模块名称',
  `MODULE_URL` varchar(64) DEFAULT NULL COMMENT '模块URL',
  `PARENT_ID` varchar(8) DEFAULT NULL COMMENT '父模块ID',
  `LEAF_TYPE` int(1) DEFAULT NULL COMMENT '节点类型(0:父节点;1:子节点)，系统字段统一维护',
  `EXPANDED_STATUS` int(1) DEFAULT NULL COMMENT '展开状态(1:展开;0:收缩)，系统字段统一维护',
  `DISPLAY_INDEX` int(2) DEFAULT NULL COMMENT '显示顺序',
  `IS_DISPLAY` int(1) DEFAULT NULL COMMENT '是否显示 0:否 1:是，系统字段统一维护',
  `ICON_CSS` varchar(128) DEFAULT NULL COMMENT '图标或者样式',
  `INFORMATION` varchar(128) DEFAULT NULL COMMENT '节点说明',
  PRIMARY KEY (`MODULE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_modules
-- ----------------------------
INSERT INTO `base_modules` VALUES ('1161', '系统设置', '', '0', '0', '1', '1', '1', 'fa fa-bookmark-o', '');
INSERT INTO `base_modules` VALUES ('1162', '菜单管理', '/baseModules/show?menu_id=1162', '1161', '1', '0', '3', '1', null, '');
INSERT INTO `base_modules` VALUES ('1162_1', '新增菜单', 'module:create', '1162', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1162_2', '删除菜单', 'module:delete', '1162', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1162_3', '查询菜单', 'module:search', '1162', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1162_4', '修改菜单', 'module:update', '1162', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1163', '账号管理', '/baseUsers/show?menu_id=1163', '1161', '1', '0', '2', '1', null, '');
INSERT INTO `base_modules` VALUES ('1163_1', '新建用户', 'user:create', '1163', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1163_2', '删除用户', 'user:delete', '1163', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1163_3', '查询用户', 'user:search', '1163', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1163_4', '修改用户', 'user:update', '1163', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1163_5', '用户启用/禁用', 'user:status', '1163', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1163_6', '重置密码', 'user:resetPass', '1163', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1164', '角色管理', '/baseRoles/show?menu_id=1164', '1161', '1', '0', '5', '1', null, '');
INSERT INTO `base_modules` VALUES ('1164_1', '新增角色', 'role:create', '1164', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1164_2', '删除角色', 'role:delete', '1164', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1164_3', '查询角色', 'role:search', '1164', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1164_4', '修改角色', 'role:update', '1164', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1164_5', '角色授权', 'role:permisson', '1164', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1165', '数据字典', '/baseFields/show?menu_id=1165', '1161', '1', '0', '4', '1', null, '');
INSERT INTO `base_modules` VALUES ('1165_1', '新增字典', 'field:create', '1165', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1165_2', '删除字典', 'field:delete', '1165', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1165_3', '编辑字典', 'field:update', '1165', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1165_4', '查询字典', 'field:search', '1165', '2', null, null, null, '', '');
INSERT INTO `base_modules` VALUES ('1191', '网络接入管理', '', '0', '0', '1', '2', '2', 'fa fa-bookmark-o', '');
INSERT INTO `base_modules` VALUES ('1192', '设备管理', '/deviceManage/show?menu_id=1192', '1191', '1', null, '1', null, '', '');
INSERT INTO `base_modules` VALUES ('1193', '接入审批', '/applyManage/show?menu_id=1193', '1191', '1', '0', '2', '1', null, null);
INSERT INTO `base_modules` VALUES ('1193_1', '审批接入信息', 'trManage:approve', '1193', '2', null, null, null, null, null);
INSERT INTO `base_modules` VALUES ('1193_2', '查询接入信息', 'trManage:search', '1193', '2', null, null, null, null, null);

-- ----------------------------
-- Table structure for base_roles
-- ----------------------------
DROP TABLE IF EXISTS `base_roles`;
CREATE TABLE `base_roles` (
  `ROLE_ID` varchar(32) NOT NULL COMMENT '主键',
  `ROLE_NAME` varchar(64) NOT NULL COMMENT '角色名称',
  `ROLE_DESC` varchar(128) DEFAULT NULL COMMENT '角色描述',
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_roles
-- ----------------------------
INSERT INTO `base_roles` VALUES ('04ba91fd893947ac81d00f49c461f276', 'test6', '');
INSERT INTO `base_roles` VALUES ('0a2f6954e66145a69887f082a4b72eae', 'test5', '');
INSERT INTO `base_roles` VALUES ('2aceed526e5a47599d73d598a9074206', '系统管理员', '系统管理员');
INSERT INTO `base_roles` VALUES ('2ba15dd80d8e41468817547d49b8f003', 'test4', '');
INSERT INTO `base_roles` VALUES ('54f2ece09a29444cb093dad0fa614b06', 'aaa', 'aaaa');
INSERT INTO `base_roles` VALUES ('934b750bc7ba4ddb829c582df65c8a0c', 'test1', '');
INSERT INTO `base_roles` VALUES ('9d2348607005464b98943ad65007ab9a', 'test7', '');
INSERT INTO `base_roles` VALUES ('a03307c056274535af7cb7ce779b836f', '测试', '');
INSERT INTO `base_roles` VALUES ('a058b378e1ad4fd894cfe70ec5404bd2', 'test91', '');
INSERT INTO `base_roles` VALUES ('a6ecee191c794214964439ddb067c60f', 'test', '测试');
INSERT INTO `base_roles` VALUES ('d36f3a6ffad64f28b28d61db78054824', 'test2', '');
INSERT INTO `base_roles` VALUES ('fb00f138c30e485a9a6deb5319b50969', 'test3', '');

-- ----------------------------
-- Table structure for base_role_module
-- ----------------------------
DROP TABLE IF EXISTS `base_role_module`;
CREATE TABLE `base_role_module` (
  `ROLE_ID` varchar(32) NOT NULL COMMENT '角色ID',
  `MODULE_ID` varchar(32) NOT NULL COMMENT '模块ID',
  PRIMARY KEY (`ROLE_ID`,`MODULE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_role_module
-- ----------------------------
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1161');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1162');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1162_1');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1162_2');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1162_3');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1162_4');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1163');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1163_1');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1163_2');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1163_3');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1163_4');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1163_5');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1163_6');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1164');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1164_1');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1164_2');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1164_3');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1164_4');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1164_5');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1165');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1165_1');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1165_2');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1165_3');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1165_4');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1191');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1192');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1193');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1193_1');
INSERT INTO `base_role_module` VALUES ('2aceed526e5a47599d73d598a9074206', '1193_2');

-- ----------------------------
-- Table structure for base_users
-- ----------------------------
DROP TABLE IF EXISTS `base_users`;
CREATE TABLE `base_users` (
  `USER_ID` varchar(32) DEFAULT NULL COMMENT '主键',
  `USER_ACCOUNT` varchar(64) DEFAULT NULL COMMENT '账号',
  `USER_PASSWORD` varchar(64) DEFAULT NULL COMMENT '密码（密文）',
  `USER_NAME` varchar(64) DEFAULT NULL COMMENT '用户真实姓名',
  `USER_SEX` int(1) DEFAULT NULL COMMENT '性别 0:男 1:女，系统字段统一维护',
  `USER_EMAIL` varchar(64) DEFAULT NULL COMMENT '电子邮件地址',
  `USER_MOBILE` varchar(32) DEFAULT NULL COMMENT '用户手机号',
  `USER_OFFICE_PHONE` varchar(32) DEFAULT NULL COMMENT '办公电话',
  `USER_ERROR_COUNT` int(2) DEFAULT NULL COMMENT '密码错误次数',
  `USER_LAST_LOGIN_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '上次登录时间',
  `USER_LAST_LOGIN_IP` varchar(32) DEFAULT NULL COMMENT '上次登录IP地址',
  `USER_REMARK` varchar(128) DEFAULT NULL COMMENT '备注',
  `USER_STATUS` varchar(2) DEFAULT NULL COMMENT '系统参数表维护，FIELD :MDM_USER_STATUS 0：启用，1：停用'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_users
-- ----------------------------
INSERT INTO `base_users` VALUES ('111', 'admin', '123456', '系统管理员', '0', 'admin@ty.com', '13888888888', '', null, '2015-08-12 11:31:16', '10.8.40.148', 'xxx', '0');
INSERT INTO `base_users` VALUES ('862bf83a7b0941e4801fe82c824cb05c', 'test3', '123456', '??1111111111111111111', '0', 'QQ1111111111111111@qq.com', '13512340009', '027-12345611', null, '2015-07-06 18:20:01', null, '1', '0');
INSERT INTO `base_users` VALUES ('4a4e164516684b61a63e932d5151fd50', 'testtest1', '888888', 'fegkrjg', null, '', 'testtest1', null, null, '2015-07-08 13:28:02', '10.8.40.109', null, '0');
INSERT INTO `base_users` VALUES ('ccf4b0265d304afa81439cccdfe1be90', 'test0051', '111111', 'test005', '1', '', '', '', null, '2015-07-23 13:52:22', '10.8.40.108', '', '0');
INSERT INTO `base_users` VALUES ('9e5b80efa50c4df098ecf5d875ee6162', 'test0066', '111111', '11111111111111111111111111111111', '0', 'QQ1111111111111111112@qq.com', '13612341234', '027-128987891', null, '2015-07-06 18:42:18', null, '5test005test005test005test005test005test005test005test005', '0');
INSERT INTO `base_users` VALUES ('a3c0e2fd098c45479b9eb0589c18fb0c', 'aaaaa', '111111', '111111', '0', '', '', '', null, null, null, '', '0');
INSERT INTO `base_users` VALUES ('d1ca931b7095433994a441666dc38677', 'testing', '111111', '测试员', '0', '', '', '', null, null, null, '', '0');
INSERT INTO `base_users` VALUES ('7c82af84541845eda819bdc5325dbd6e', 'test9999', '111111', '测试员工', '0', '', '', '', null, null, null, '', '0');
INSERT INTO `base_users` VALUES ('67db08a0d50342488a56ce06fd4ab1bb', 'retest', '10025854', null, null, 'hejunna@whty.com.cn', 'retest', null, null, '2015-07-09 10:32:13', '10.8.40.109', null, '0');
INSERT INTO `base_users` VALUES ('1286743f1bb1417d8aa702709a6610b5', 'psmtest', '123456', '', null, '', '', null, null, null, null, null, '0');
INSERT INTO `base_users` VALUES ('5dfa5d60557a48a88ff61fa39915b658', 'ttttttttt', '123456', '', null, '', '', null, null, '2015-07-08 13:55:16', '10.8.40.147', null, '0');
INSERT INTO `base_users` VALUES ('80a1b022c6214daeb0a0f15146783b3f', '12345', '123456', '%%%', '1', '', '', '', null, null, null, '', '0');
INSERT INTO `base_users` VALUES ('02d324e0ba164fe182f8b7fd9dc05bd2', 'tttrrr123', 'tttrrr123', '', null, '', '', null, null, '2015-07-09 16:40:46', '10.8.40.109', null, '0');
INSERT INTO `base_users` VALUES ('c4cc91560eae4b159353875e341f7c34', 'yutest', 'test1111', 'lwegjrl', null, 'elgkrjg@qq.com', '13456789563', null, null, '2015-07-09 16:45:55', '10.8.40.109', null, '0');
INSERT INTO `base_users` VALUES ('926e80d357914f3a962acc055ed27ff5', 'testtest11', 'whty1234', 'lekgjlr', null, 'null', 'null', null, null, '2015-07-13 15:40:23', '10.8.40.109', null, '0');
INSERT INTO `base_users` VALUES ('a21c6779d26849d1ab282da3f284e0c9', '15927331501', 'a1111111', '11', null, '', null, null, null, '2015-07-15 11:43:41', '10.8.40.108', null, '0');

-- ----------------------------
-- Table structure for base_user_role
-- ----------------------------
DROP TABLE IF EXISTS `base_user_role`;
CREATE TABLE `base_user_role` (
  `USER_ID` varchar(32) NOT NULL COMMENT '用户ID',
  `ROLE_ID` varchar(32) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`USER_ID`,`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_user_role
-- ----------------------------
INSERT INTO `base_user_role` VALUES ('111', '2aceed526e5a47599d73d598a9074206');
INSERT INTO `base_user_role` VALUES ('3c6e49e719cd4023abf80d6be27c8cdb', '54f2ece09a29444cb093dad0fa614b06');
INSERT INTO `base_user_role` VALUES ('3d1e50ad41ba45bbbbfdb3d13cc9fdc2', '67c39c312c314c41b9975a7078b31b69');
INSERT INTO `base_user_role` VALUES ('5d83fbbccd9249829c44e53869b0a5d4', '93395dba324145dab74a4b8fa3e44486');
INSERT INTO `base_user_role` VALUES ('7c82af84541845eda819bdc5325dbd6e', '04ba91fd893947ac81d00f49c461f276');
INSERT INTO `base_user_role` VALUES ('80a1b022c6214daeb0a0f15146783b3f', '04ba91fd893947ac81d00f49c461f276');
INSERT INTO `base_user_role` VALUES ('85ede171fa3b4e4c97bc426b8522c1b8', '54f2ece09a29444cb093dad0fa614b06');
INSERT INTO `base_user_role` VALUES ('862bf83a7b0941e4801fe82c824cb05c', '2aceed526e5a47599d73d598a9074206');
INSERT INTO `base_user_role` VALUES ('9e5b80efa50c4df098ecf5d875ee6162', '04ba91fd893947ac81d00f49c461f276');
INSERT INTO `base_user_role` VALUES ('a3c0e2fd098c45479b9eb0589c18fb0c', '04ba91fd893947ac81d00f49c461f276');
INSERT INTO `base_user_role` VALUES ('c6658ff79d4a4c548f2ebf2422e00126', '67c39c312c314c41b9975a7078b31b69');
INSERT INTO `base_user_role` VALUES ('ccf4b0265d304afa81439cccdfe1be90', '0a2f6954e66145a69887f082a4b72eae');
INSERT INTO `base_user_role` VALUES ('d1ca931b7095433994a441666dc38677', '04ba91fd893947ac81d00f49c461f276');

-- ----------------------------
-- Table structure for cable
-- ----------------------------
DROP TABLE IF EXISTS `cable`;
CREATE TABLE `cable` (
  `cable_id` int(11) NOT NULL,
  `cable_name` varchar(255) DEFAULT NULL,
  `switch_port__id` int(11) DEFAULT NULL,
  `is_use` char(2) DEFAULT NULL,
  PRIMARY KEY (`cable_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cable
-- ----------------------------

-- ----------------------------
-- Table structure for device
-- ----------------------------
DROP TABLE IF EXISTS `device`;
CREATE TABLE `device` (
  `device_id` int(11) NOT NULL,
  `device_name` varchar(255) DEFAULT NULL,
  `device_type` int(11) DEFAULT NULL,
  `device_os` varchar(255) DEFAULT NULL,
  `device_purpose` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`device_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of device
-- ----------------------------

-- ----------------------------
-- Table structure for networkadapter
-- ----------------------------
DROP TABLE IF EXISTS `networkadapter`;
CREATE TABLE `networkadapter` (
  `networkadapter_id` int(11) NOT NULL,
  `networkadapter_type` int(11) DEFAULT NULL,
  `networkadapter_mac` varchar(255) DEFAULT NULL,
  `device_id` int(11) DEFAULT NULL,
  `cable_id` int(11) DEFAULT NULL,
  `conference_code` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `deadline` datetime DEFAULT NULL,
  PRIMARY KEY (`networkadapter_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of networkadapter
-- ----------------------------

-- ----------------------------
-- Table structure for switch
-- ----------------------------
DROP TABLE IF EXISTS `switch`;
CREATE TABLE `switch` (
  `switch_id` int(11) NOT NULL,
  `switch_name` varchar(255) DEFAULT NULL,
  `switch_type` int(11) DEFAULT NULL,
  `management_ip` varchar(255) DEFAULT NULL,
  `location_id` int(11) DEFAULT NULL,
  `port_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`switch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of switch
-- ----------------------------

-- ----------------------------
-- Table structure for switchport
-- ----------------------------
DROP TABLE IF EXISTS `switchport`;
CREATE TABLE `switchport` (
  `switch_port_id` int(11) NOT NULL,
  `switch_port` varchar(255) DEFAULT NULL,
  `vlan_id` int(11) DEFAULT NULL,
  `switch_id` int(11) DEFAULT NULL,
  `port_desc` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `limit_speed` double DEFAULT NULL,
  PRIMARY KEY (`switch_port_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of switchport
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_type` int(11) DEFAULT NULL,
  `user_department` varchar(255) DEFAULT NULL,
  `user_phone` varchar(255) DEFAULT NULL,
  `user_leader` varchar(255) DEFAULT NULL,
  `device_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for vlan
-- ----------------------------
DROP TABLE IF EXISTS `vlan`;
CREATE TABLE `vlan` (
  `vlan_id` int(11) NOT NULL,
  `vlan_name` varchar(255) DEFAULT NULL,
  `vlan_desc` varchar(255) DEFAULT NULL,
  `ip_section` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`vlan_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vlan
-- ----------------------------
