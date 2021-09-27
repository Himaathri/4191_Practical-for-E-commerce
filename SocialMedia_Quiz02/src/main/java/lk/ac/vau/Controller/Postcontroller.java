 
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
import lk.ac.vau.Model.Post;
import lk.ac.vau.Repo.Postrepo;

@RestController
@RequestMapping("Post")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_ATOM_XML)
public class Postcontroller {
	
	@Autowired
	Postrepo context;
	@GetMapping
	public List<Post> getAll()
	{
		return  context.findAll();
	}
	
	@GetMapping("/{id}")
	public Post get(@PathVariable("id") Long id)
	{
		return  context.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Post pos )
	{
		context.save(pos);
	}
	
	@PutMapping
	public void update(@RequestBody Post pos)
	{
		context.save(pos);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id)
	{
		context.deleteById(id);
	}
	
		
}
