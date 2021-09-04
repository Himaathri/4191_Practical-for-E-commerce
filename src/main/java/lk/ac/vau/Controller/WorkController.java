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

import lk.ac.vau.Model.Work;
import lk.ac.vau.Repo.WorkRepo;

 

@RestController
@RequestMapping("work")
public class WorkController {
	
	@Autowired
	WorkRepo context;
	@GetMapping
	public List<Work> getAll()
	{
		return context.findAll();
	}

	@GetMapping("{/id}")
	public Work get(@PathVariable("id") int id)
	{
		return context.findById(id).get();
		
	}
	
	@PostMapping
	public void add(@RequestBody Work wk )
	{
		context.save(wk);
	}
	
	@PutMapping
	public void update(@RequestBody Work wk)
	{
		context.save(wk);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id)
	{
		context.deleteById(id);
	}
	
}

	



