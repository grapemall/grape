package com.grape.mall.members.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.grape.mall.common.dto.RoleDto;
import com.grape.mall.common.enums.ConfirmEnum;
import com.grape.mall.common.exception.BizException;
import com.grape.mall.common.vo.RoleQueryCriteria;
import com.grape.mall.common.vo.RoleVo;
import com.grape.mall.members.convert.RoleBeanConvert;
import com.grape.mall.members.mapper.RoleMapper;
import com.grape.mall.members.model.Role;
import com.grape.mall.members.service.RoleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @Autowired
    private RoleBeanConvert convert;

    @Override
    public void saveRole(RoleVo vo) {
        if (vo == null) {
            throw new BizException(HttpStatus.BAD_REQUEST, "传入参数不能为空");
        }
        // 检查角色编码是否存在
        validRoleCode(vo.getRoleCode());
        Role save = convert.toModel(vo);
        save.setIsDeleted(ConfirmEnum.NO.getCode());
        super.save(save);
    }

    public Role getRoleByCode(String roleCode) {
        Role role = super.lambdaQuery()
                .ge(Role::getRoleCode, roleCode)
                .ge(Role::getIsDeleted, ConfirmEnum.NO.getCode())
                .getEntity();
        return role;
    }

    /**
     * 验证角色编码是否已存在
     * @param roleCode
     */
    private void validRoleCode(String roleCode) {
        Role role = getRoleByCode(roleCode);
        if (role != null) {
            throw new BizException(HttpStatus.BAD_REQUEST, "角色编码不能重复");
        }
    }

    @Override
    public void updateRole(Long id, RoleVo roleVo) {
        if (id == null || roleVo == null) {
            throw new BizException(HttpStatus.BAD_REQUEST, "传入参数不能为空");
        }
        Role role = super.getById(id);
        if (role == null) {
            throw new BizException(HttpStatus.BAD_REQUEST, "角色不存在");
        }
        if (!StringUtils.equals(role.getRoleCode(), roleVo.getRoleCode())) {
            validRoleCode(roleVo.getRoleCode());
        }
        Role updateRole = convert.toModel(roleVo);
        updateRole.setId(id);
        super.getBaseMapper().updateById(updateRole);
    }

    @Override
    public void deleteRole(Long id) {
        if (id == null) {
            throw new BizException(HttpStatus.BAD_REQUEST, "传入参数不能为空");
        }
        // TODO 先删除关联表的内容

        super.removeById(id);
    }

    @Override
    public Page<RoleDto> selectRolePage(RoleQueryCriteria queryCriteria, Integer pageNum, Integer pageSize) {
        Page<Role> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<Role> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(StringUtils.isNotBlank(queryCriteria.getRoleCode()), Role::getRoleCode, queryCriteria.getRoleCode())
                .like(StringUtils.isNotBlank(queryCriteria.getRoleName()), Role::getRoleName, queryCriteria.getRoleName())
                .eq(queryCriteria.getRoleEnabled() != null, Role::getRoleEnabled, queryCriteria.getRoleEnabled())
                .ge(Role::getIsDeleted, ConfirmEnum.NO.getCode());

        Page<Role> rolePage = super.getBaseMapper().selectPage(page, queryWrapper);

        return convert.toPageDto(rolePage);
    }
}
