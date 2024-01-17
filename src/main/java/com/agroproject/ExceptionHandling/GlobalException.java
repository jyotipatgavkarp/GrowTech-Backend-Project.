package com.agroproject.ExceptionHandling;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(ClassNotFoundException.class)
	public ResponseEntity<?> HandelNoSuchElementException(ClassNotFoundException ex)
	{
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);	
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map> ValidationException(MethodArgumentNotValidException ex)
	{
	    List<ObjectError> allResult= ex.getBindingResult().getAllErrors();		 	    
		Map<String, String> hashmapWithError= new HashMap<>();
		for(ObjectError err : allResult )
		{
		String field=((FieldError)err).getField();
		String defaultMsg=err.getDefaultMessage();
		hashmapWithError.put(field, defaultMsg);
		}
		return new ResponseEntity<Map>(hashmapWithError,HttpStatus.BAD_REQUEST);
	}
}