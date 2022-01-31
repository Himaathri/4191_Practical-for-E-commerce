package lk.ac.vau.ExceptionHandler;

import java.util.NoSuchElementException;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentException {
	@ExceptionHandler
	public String entityNotFoundHelper(EntityNotFoundException exception,Model model)
	{
		model.addAttribute("statusCode",HttpStatus.NOT_FOUND.toString());
		model.addAttribute("message",exception.getMessage());
		return "student/error";
	}
	
	@ExceptionHandler(NoSuchElementException.class)
	public String noSuchElementHelper(NoSuchElementException exception,Model model) {
		model.addAttribute("statusCode", HttpStatus.NOT_FOUND.toString());
		model.addAttribute("message",exception.getMessage());
		return "student/error";
	}
	
	
}
