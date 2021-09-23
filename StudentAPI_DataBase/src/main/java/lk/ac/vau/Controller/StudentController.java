package lk.ac.vau.Controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.StudentModel;
import lk.ac.vau.Repo.SudentRepo;

@RestController
@RequestMapping("student")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_ATOM_XML)

public class StudentController{
//CRUD
	//student repo included in the runtime env
	@Autowired 
	SudentRepo context;
	@GetMapping
	public List<StudentModel> getAll()
	{
		return context.findAll();
	}
	
	
	@GetMapping("/{id}")
	public StudentModel get(@PathVariable("id") String id )
	{
		return context.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody StudentModel student)
	{
		context.save(student);
	}
	
	@PutMapping
	public void update(@RequestBody StudentModel student)
	{
		context.save(student);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id )
	{
		  context.deleteById(id);
	}
	
}
