package com.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//Provide the necessary Annotation.

public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {

		//fill code

		return null;
	}

	public final ResponseEntity<ExceptionResponse> handleNotFoundException(Exception ex, WebRequest request) {

		//fill code

		return null;
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

		//fill code

		return null;
	}



}



