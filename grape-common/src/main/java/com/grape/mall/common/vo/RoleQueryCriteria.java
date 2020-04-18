package com.grape.mall.common.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleQueryCriteria implements Serializable {

    /**
     * 角色编码
     */
    private String roleCode;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 是否启用
     */
    private Integer roleEnabled;

}
