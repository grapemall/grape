package com.grape.mall.members.service.impl;

import com.grape.mall.members.model.Role;
import com.grape.mall.members.mapper.RoleMapper;
import com.grape.mall.members.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表  服务实现类
 * </p>
 *
 * @author grape_mall
 * @since 2020-04-12
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
	
}
