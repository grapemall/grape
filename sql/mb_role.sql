DROP TABLE IF EXISTS `mb_role`;
CREATE TABLE `mb_role` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `role_code` varchar(45) DEFAULT NULL COMMENT '角色编码',
  `role_name` varchar(45) DEFAULT NULL COMMENT '角色名称',
  `role_desc` varchar(100) DEFAULT NULL COMMENT '角色描述',
  `role_enabled` tinyint(1) DEFAULT '1' COMMENT '是否启用',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `role_code_UNIQUE` (`role_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='角色表';