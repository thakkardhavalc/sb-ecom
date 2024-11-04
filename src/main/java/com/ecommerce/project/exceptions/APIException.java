package com.ecommerce.project.exceptions;

import java.io.Serial;

/**
 * Author: dhhaval thakkar
 * Date:2024-11-01
 */
public class APIException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public APIException() {
    }

    public APIException(String message) {
        super(message);
    }

}
