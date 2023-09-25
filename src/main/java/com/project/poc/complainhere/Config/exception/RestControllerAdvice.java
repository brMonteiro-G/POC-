package com.project.poc.complainhere.Config.exception;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@org.springframework.web.bind.annotation.RestControllerAdvice
public class RestControllerAdvice {

    private final MessageSource messageSource;

    public RestControllerAdvice(MessageSource messageSource){
      this.messageSource=messageSource;
    }
    

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<ErrorResponse> handle(MethodArgumentNotValidException exception) {
        List<ErrorResponse> listOfException = new ArrayList<>();

        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();

        fieldErrors.forEach(e -> {
            String message = messageSource.getMessage(e, LocaleContextHolder.getLocale());
            ErrorResponse error = new ErrorResponse(HttpStatus.BAD_REQUEST, Collections.singletonList(message),e.getField());
            listOfException.add(error);
        });

        return listOfException;
    }








}
