package com.grape.mall.members.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.grape.mall.common.dto.RoleDto;
import com.grape.mall.common.vo.RoleQueryCriteria;
import com.grape.mall.common.vo.RoleVo;
import com.grape.mall.members.model.Role;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author grape_mall
 * @since 2020-04-12
 */
public interface RoleService extends IService<Role> {


    /**
     * 新增角色
     * @param vo 传入参数对象
     */
    void saveRole(RoleVo vo);

    /**
     * 修改角色
     * @param id 角色主键
     * @param roleVo 传入参数对象
     */
    void updateRole(Long id, RoleVo roleVo);

    /**
     * 根据角色编码查询角色
     * @param roleCode 角色编码
     * @return 角色信息
     */
    Role getRoleByCode(String roleCode);

    /**
     * 删除角色
     * @param id
     */
    void deleteRole(Long id);

    /**
     * 分页查询角色
     * @param queryCriteria 查询条件
     * @param pageNum 当前页
     * @param pageSize 每页条数
     * @return
     */
    Page<RoleDto> selectRolePage(RoleQueryCriteria queryCriteria, Integer pageNum, Integer pageSize);
}
