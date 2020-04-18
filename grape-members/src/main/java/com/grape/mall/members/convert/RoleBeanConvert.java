package com.grape.mall.members.convert;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.grape.mall.common.convert.EntityConvert;
import com.grape.mall.common.dto.RoleDto;
import com.grape.mall.common.vo.RoleVo;
import com.grape.mall.members.model.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleBeanConvert extends EntityConvert<RoleDto, RoleVo, Role> {

    Page<RoleDto> toPageDto(Page<Role> rolePage);

}
