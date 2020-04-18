package com.grape.mall.common.vo;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.TableField;
import com.grape.mall.common.enums.EnableEnum;
import com.grape.mall.common.validation.EnumMatch;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class RoleVo implements Serializable {

    /**
     * 角色编码
     */
    @NotBlank
    private String roleCode;

    /**
     * 角色名称
     */
    @NotBlank
    private String roleName;

    /**
     * 角色描述
     */
    private String roleDesc;

    /**
     * 是否启用
     */
    @NotNull
    @EnumMatch(EnableEnum.class)
    private Integer roleEnabled;

}
