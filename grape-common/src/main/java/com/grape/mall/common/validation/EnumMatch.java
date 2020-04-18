package com.grape.mall.common.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = { EnumMatchValidator.class })
@Target({ METHOD, FIELD})
@Retention(RUNTIME)
public @interface EnumMatch {

    String message() default "枚举值不正确";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    Class<? extends EnumValidator> value();

}

