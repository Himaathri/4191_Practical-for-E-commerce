 
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

import lk.ac.vau.Model.Comment;
 import lk.ac.vau.Repo.Commentrepo;
 
@RestController
@RequestMapping("Comment")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_ATOM_XML)
public class Commentcontroller {
	
	@Autowired
	Commentrepo context;
	@GetMapping
	public List<Comment> getAll()
	{
		return  context.findAll();
	}
	
	@GetMapping("/{id}")
	public Comment get(@PathVariable("id") Long id)
	{
		return  context.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Comment com )
	{
		context.save(com);
	}
	
	@PutMapping
	public void update(@RequestBody Comment com)
	{
		context.save(com);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id)
	{
		context.deleteById(id);
	}
}
