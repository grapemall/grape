package com.grape.mall.members.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.grape.mall.members.service.RoleService;
/**
 * <p>
 * 角色表  前端控制器
 * </p>
 *
 * @author grape_mall
 * @since 2020-04-12
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;
}
