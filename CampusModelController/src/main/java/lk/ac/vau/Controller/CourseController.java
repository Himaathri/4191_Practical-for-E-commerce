 package lk.ac.vau.Controller;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Course;
import lk.ac.vau.Repo.CourseRepo;
//import lk.ac.vau.Repo.Repo;

@RestController
@RequestMapping("course")
//Output in XML
@Produces(MediaType.APPLICATION_ATOM_XML_VALUE)
//Input in XML
@Consumes(MediaType.APPLICATION_ATOM_XML_VALUE)

public class CourseController {
	
	//private Repo<String, Course> courses=new Repo<String, Course>();
	
	
	private CourseRepo courses=new CourseRepo();
	//Get all Courses
	 @GetMapping
 	  public Collection<Course>getAll(){
		//add();
		 return courses.getAll();
	 }
	 
	 /*Get ONE Courses*/
	 @GetMapping("/{id}")
	 public Course get(@PathVariable("id") String id)
	 {
		 	//add();
		 	return courses.get(id);
	 }
	 
	 //Add Courses
	 @PostMapping
	 public void add(@RequestBody Course course)
	 {
		 courses.add(course);
	 }
	 
	
	 //Delete record
	 @DeleteMapping("/{id}")
	 public void delete(@PathVariable("id") String id)
	 {
		 	 
		 courses.delete(id);
	 }
	 //Update a record
	 @PutMapping("/{id}")
	 public void update(@PathVariable("id") String id,Course course)
	 {
		 	 
		 courses.update(id,course);
	 }
	 

}
