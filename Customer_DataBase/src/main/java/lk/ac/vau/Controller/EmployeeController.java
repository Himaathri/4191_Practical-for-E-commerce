package lk.ac.vau.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Employee;
import lk.ac.vau.Repo.EmpRepo;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	EmpRepo context;
	@GetMapping
	public List<Employee> getAll()
	{
		return context.findAll();
	}
/*	
	@GetMapping("{/id}")
	public Employee get(@PathVariable("id") int id)
	{
		return context.findById(id).get();
		
	}
	
	@PostMapping
	public void add(@RequestBody Employee emp )
	{
		context.save(emp);
	}
	
	@PutMapping
	public void update(@RequestBody Employee emp)
	{
		context.save(emp);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id)
	{
		context.deleteById(id);
	}*/
	
}
