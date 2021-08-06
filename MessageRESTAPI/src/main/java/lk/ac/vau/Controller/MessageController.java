package lk.ac.vau.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Message;

@RestController
public class MessageController {
	@GetMapping("/msg")
	public Message getMessage()
	{
		
		return new Message(1,"Hello Spring boot");
	}
	@GetMapping("/msg/{m}")
	public Message myMessage(@PathVariable("m") String message)
	{
		return new Message(1,message);
	}
	
	@GetMapping("/sum/{n1}/{n2}")
	public double sum(@PathVariable("n1")double n1,@PathVariable("n2")double n2)
	{
		return n1+n2;
	}
	@GetMapping("/sub")
	public double sub(@RequestParam(value="n1",defaultValue="0")double n1,@RequestParam(value="n2",defaultValue="0")double n2)
	{
		return n1-n2;
	}
	@GetMapping("/mul/{n1}/{n2}")
	public double mul(@PathVariable("n1")double n1,@PathVariable("n2")double n2)
	{
		return n1*n2;
	}
	@GetMapping("/div")
	public double div(@RequestParam(value="n1",defaultValue="10")double n1,@RequestParam(value="n2",defaultValue="2")double n2)
	{
		return n1/n2;
	}
}
