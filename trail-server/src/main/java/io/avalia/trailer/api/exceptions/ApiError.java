package io.avalia.trailer.api.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
class ApiError {

    private HttpStatus status;
    private String message;

    private ApiError() {
    }

    ApiError(HttpStatus status) {
        this();
        this.status = status;
    }
}