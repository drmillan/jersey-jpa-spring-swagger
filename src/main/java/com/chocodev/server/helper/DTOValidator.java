/**
 * 
 */
package com.chocodev.server.helper;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

/**
 * @author Daniel Rodriguez Millan
 *
 */
public class DTOValidator {
    private Validator validator;
    public <T> Set<ConstraintViolation<T>> validate(T arg0, Class<?>... arg1) {
        return validator.validate(arg0, arg1);
    }
    public DTOValidator()
    {
        validator=Validation.buildDefaultValidatorFactory().getValidator();
    }
}
