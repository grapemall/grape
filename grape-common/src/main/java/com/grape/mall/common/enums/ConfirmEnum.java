package com.grape.mall.common.enums;

import com.grape.mall.common.validation.EnumValidator;
import lombok.Getter;

@Getter
public enum  ConfirmEnum implements EnumValidator<Integer> {
    YES(1, "是"), NO(0, "否");

    ConfirmEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private Integer code;

    private String desc;

}
