package com.ashish.usersRoleMapping.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ashish.usersRoleMapping.util.GenericResponse;
import com.ashish.usersRoleMapping.util.ResponseHeaderUtility;



@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UsernameNotFoundException.class)
	public ResponseEntity<GenericResponse> handlerResourceNotFoundException(UsernameNotFoundException ex1) {
		GenericResponse resp = getResponse("failure", "-1", ex1.getMessage(), "Response not found", null);
		return new ResponseEntity<>(resp, ResponseHeaderUtility.HttpHeadersConfig(), HttpStatus.OK);

	}

	@ExceptionHandler(ServiceUnavailableExection.class)
	public ResponseEntity<GenericResponse> handlerResourceNotFoundException(ServiceUnavailableExection ex1) {
		GenericResponse resp = getResponse("failure", "-2", ex1.getMessage(), "Response not found", null);
		return new ResponseEntity<>(resp, ResponseHeaderUtility.HttpHeadersConfig(), HttpStatus.OK);

	}

	private GenericResponse getResponse(String status, String errorCode, String errorMesg, String erroDesc,
			Object userData) {
		GenericResponse objGenericResponse = new GenericResponse();
		objGenericResponse.setStatus(status);
		objGenericResponse.setErrorCode(errorCode);
		objGenericResponse.setErrorDescription(errorMesg);
		objGenericResponse.setUserDisplayMesg(erroDesc);
		objGenericResponse.setData(userData);
		return objGenericResponse;
	}
}
