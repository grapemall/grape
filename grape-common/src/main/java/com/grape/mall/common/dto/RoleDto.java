package com.grape.mall.common.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.grape.mall.common.vo.RoleVo;
import lombok.Data;

@Data
public class RoleDto extends RoleVo {

    /**
     * 主键
     */
    private Long id;

    /**
     * 是否删除
     */
    private Integer isDeleted;

}
