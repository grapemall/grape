package com.grape.mall.common.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EnumMatchValidator implements ConstraintValidator<EnumMatch, Object> {

    private Class<? extends EnumValidator> enumValidator;

    @Override
    public void initialize(EnumMatch constraintAnnotation) {
        enumValidator = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) return true;
        if (isSupport(enumValidator)) {
            for (EnumValidator enumItem : enumValidator.getEnumConstants()) {
                if (enumItem.getCode().equals(value)) return true;
            }
        }
        return false;
    }

    private boolean isSupport(Class<? extends EnumValidator> enumValidator) {
        return enumValidator.isEnum();
    }
}
