 
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
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import lk.ac.vau.Model.Comment;
import lk.ac.vau.Model.Post;
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
		//return  context.findAll();
		
		List<User> users=context.findAll();
		for(User u:users)
		{
			String userUrl=linkTo(Usercontroller.class).slash(u.getUserId()).toString();
			String postUrl= linkTo(Usercontroller.class).slash(u.getUserId()).toString();
			String commentUrl= linkTo(Usercontroller.class).slash(u.getUserId()).toString();
			u.addLink(userUrl, "User");
			u.addLink(postUrl, "Post");
			u.addLink(commentUrl, "Comment");
		}
		return users;
	}
	
	@GetMapping("/{id}")
	public User get(@PathVariable("id") String id)
	{
		//return  context.findById(id).get();
		
				//http://localhost:8080/user/uid1101/post
				String postUrl= linkTo(Usercontroller.class).slash(id).slash("Post").toString();
				//http://localhost:8080/user/uid1101/comment
				String commentUrl= linkTo(Usercontroller.class).slash(id).slash("Comment").toString();
				User user =context.findById(id).get();
				user.addLink(postUrl, "Post");
				user.addLink(commentUrl, "Comment");
				return user;
		
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
	
	//getting all posts of a certain user with userid
	@GetMapping("/{id}/Post")
	public List<Post> getPost(@PathVariable("id") String id) {
		return context.findById(id).get().getPosts();
	}
	//getting all comments of a certain user with userid

	@GetMapping("/{id}/Comment")
	public List<Comment> getComment(@PathVariable("id") String id) {
		return context.findById(id).get().getComments();
	}
	
}
