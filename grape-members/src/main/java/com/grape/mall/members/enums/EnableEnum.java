package com.grape.mall.members.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum EnableEnum {

    ENABLED(1, "启用"), DISABLED(0, "未启用");

    EnableEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @EnumValue
    @JsonValue
    private Integer code;

    private String desc;
}
