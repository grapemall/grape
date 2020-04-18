package com.grape.mall.members.convert;

import com.grape.mall.common.convert.BeanConvert;
import com.grape.mall.common.dto.RoleDto;
import com.grape.mall.common.vo.RoleVo;
import com.grape.mall.members.model.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleBeanConvert extends BeanConvert<RoleDto, RoleVo, Role> {

}
