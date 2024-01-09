package lk.ijse.spring.advisor;

import lk.ijse.spring.util.ResponceUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({RuntimeException.class})
    public ResponceUtil handleMyExeption(RuntimeException e){
        System.out.println(e);
        return new ResponceUtil("Error",e.getMessage(),null);
    }
}
