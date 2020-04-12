package com.grape.mall.members.controller;

import com.alibaba.fastjson.JSON;
import com.grape.mall.common.dto.ResponseEntity;
import com.grape.mall.common.dto.RoleDto;
import com.grape.mall.common.exception.ErorrRequestException;
import com.grape.mall.common.vo.RoleVo;
import com.grape.mall.members.convert.RoleBeanConvert;
import com.grape.mall.members.model.Role;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Autowired
    private RoleBeanConvert roleBeanConvert;

    @GetMapping("/{id:\\d+}")
    public ResponseEntity<RoleDto> get(@PathVariable("id") Long id) {
        Role role = roleService.getById(id);
        RoleDto roleDto = roleBeanConvert.toDto(role);
        return ResponseEntity.success(roleDto);
    }

}
