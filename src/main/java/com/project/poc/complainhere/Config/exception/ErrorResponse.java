package com.project.poc.complainhere.Config.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ErrorResponse {

    private HttpStatus status;
    private List<String> errors;
    private String field;

}
