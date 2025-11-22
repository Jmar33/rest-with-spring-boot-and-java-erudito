package br.com.jmar33.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class RequiredObjectIsNullExcecption extends RuntimeException {
    public RequiredObjectIsNullExcecption()
    {
        super("It is not allowed to persist a null object");
    }

    public RequiredObjectIsNullExcecption(String message)
    {
        super(message);
    }
}
