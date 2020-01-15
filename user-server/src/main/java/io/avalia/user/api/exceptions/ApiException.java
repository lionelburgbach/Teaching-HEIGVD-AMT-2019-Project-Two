package io.avalia.user.api.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")
public class ApiException extends Exception{

    private HttpStatus code;

    public ApiException (HttpStatus code, String msg) {
        super(msg);
        this.code = code;
    }
}
