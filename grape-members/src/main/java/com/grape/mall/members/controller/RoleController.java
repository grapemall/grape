package com.grape.mall.members.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.grape.mall.common.dto.ResponseBody;
import com.grape.mall.common.dto.RoleDto;
import com.grape.mall.common.vo.RoleQueryCriteria;
import com.grape.mall.common.vo.RoleVo;
import com.grape.mall.members.convert.RoleBeanConvert;
import com.grape.mall.members.model.Role;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ResponseBody<Role> get(@PathVariable("id") Long id) {
        Role role = roleService.getById(id);
        RoleDto roleDto = roleBeanConvert.toDto(role);
        return ResponseBody.success(role);
    }

    @PostMapping
    public ResponseBody add(@Validated @RequestBody RoleVo roleVo) {
        roleService.saveRole(roleVo);
        return ResponseBody.success();
    }

    @PutMapping("/{id:\\d+}")
    public ResponseBody<Role> update(@PathVariable("id") Long id, @Validated @RequestBody RoleVo roleVo) {

        roleService.updateRole(id, roleVo);
        return ResponseBody.success();
    }

    @DeleteMapping("/{id:\\d+}")
    public ResponseBody<Role> delete(@PathVariable("id") Long id) {
        roleService.deleteRole(id);
        return ResponseBody.success();
    }

    @GetMapping
    public ResponseBody<Page<RoleDto>> select(RoleQueryCriteria queryCriteria, @RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "10") Integer pageSize) {
        Page<RoleDto> roleDtoPage = roleService.selectRolePage(queryCriteria, pageNum, pageSize);
        return ResponseBody.success(roleDtoPage);
    }
}
