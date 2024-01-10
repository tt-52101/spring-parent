package com.emily.infrastructure.autoconfigure.valid.annotation;

import com.emily.infrastructure.autoconfigure.valid.IsSuffixValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

/**
 * 校验后缀
 * 1. ElementType.ANNOTATION_TYPE 用户其它约束的约束注解
 * 2. ElementType.FIELD 受约束的属性字段
 * 3. ElementType.PARAMETER 用于受约束的方法和构造函数参数
 * 4. ElementType.METHOD 用于受约束的getter和受约束的方法返回值
 *
 * @author :  Emily
 * @since :  2023/12/24 1:35 PM
 */
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {IsSuffixValidator.class})
public @interface IsSuffix {
    /**
     * 提示信息
     */
    String message() default "非法后缀";

    /**
     * 校验分组
     */
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String[] suffixes() default {};
}
