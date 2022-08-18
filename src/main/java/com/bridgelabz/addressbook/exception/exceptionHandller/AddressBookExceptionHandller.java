package com.bridgelabz.addressbook.exception.exceptionHandller;

import com.bridgelabz.addressbook.exception.AddressNotFound;
import com.bridgelabz.addressbook.util.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.UnexpectedTypeException;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class AddressBookExceptionHandller {

    @ExceptionHandler(AddressNotFound.class)
    public ResponseEntity<Response> handleException(AddressNotFound ad){
        Response response=new Response();
        response.setMessage(ad.getMessage());
        response.setErrorcode(400);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Response> handleException(MethodArgumentNotValidException ad) {
        List<ObjectError> objectErrors=ad.getBindingResult().getAllErrors();
        List<String> Message =objectErrors.stream().map(objErr-> objErr.getDefaultMessage()).collect(Collectors.toList());
        Response response = new Response();
        response.setMessage(Message.toString());
        response.setErrorcode(400);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

//    @ExceptionHandler(UnexpectedTypeException.class)
//    public ResponseEntity<Response> handleException(UnexpectedTypeException ad) {
//        Response response = new Response();
//        response.setMessage(ad.getMessage());
//        response.setErrorcode(400);
//        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
}
