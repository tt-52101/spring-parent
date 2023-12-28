package com.emily.infrastructure.autoconfigure.valid.annotation;

import com.emily.infrastructure.autoconfigure.valid.IsIntValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

/**
 * 判断是否为int类型，如果为空则不校验
 *
 * @author :  Emily
 * @since :  2023/12/24 1:35 PM
 */
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {IsIntValidator.class})
public @interface IsInt {
    /**
     * 提示信息
     */
    String message() default "数据类型不正确";

    /**
     * 校验分组
     */
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * 值是否必须，true为必须，false为非必须
     */
    boolean required() default true;
}
