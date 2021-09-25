
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

import lk.ac.vau.Model.User;
import lk.ac.vau.Repo.Userrepo;

@RestController
@RequestMapping("User")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_ATOM_XML)

public class Usercontroller {
	
	@Autowired
	Userrepo context;
	@GetMapping
	public List<User> getAll()
	{
		return  context.findAll();
	}
	
	@GetMapping("/{id}")
	public User get(@PathVariable("id") String id)
	{
		return  context.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody User pos )
	{
		context.save(pos);
	}
	
	@PutMapping
	public void update(@RequestBody User pos)
	{
		context.save(pos);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id)
	{
		context.deleteById(id);
	}
}
