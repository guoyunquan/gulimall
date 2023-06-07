package com.gyq.common.valid;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {ListValueConstraintValidator.class})
public @interface ListValue {
    String message() default "{com.gyq.common.valid.ListValue.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * 注解中允许的值
     */
    int[] value() default{};
}
