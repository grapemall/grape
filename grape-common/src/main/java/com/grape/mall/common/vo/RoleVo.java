package com.grape.mall.common.vo;

import com.grape.mall.common.enums.EnableEnum;
import com.grape.mall.common.validation.EnumMatch;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class RoleVo implements Serializable {

    /**
     * 角色编码
     */
    @NotBlank
    @Length(max = 45)
    private String roleCode;

    /**
     * 角色名称
     */
    @NotBlank
    @Length(max = 45)
    private String roleName;

    /**
     * 角色描述
     */
    @Length(max = 100)
    private String roleDesc;

    /**
     * 是否启用
     */
    @NotNull
    @EnumMatch(EnableEnum.class)
    private Integer roleEnabled;

}
