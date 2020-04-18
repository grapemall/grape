package com.grape.mall.common.enums;

import com.grape.mall.common.validation.EnumValidator;
import lombok.Getter;

@Getter
public enum EnableEnum implements EnumValidator<Integer> {

    ENABLED(1, "启用"), DISABLED(0, "未启用");

    EnableEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private Integer code;

    private String desc;
}
