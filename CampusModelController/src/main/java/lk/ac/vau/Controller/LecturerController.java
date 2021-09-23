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

import lk.ac.vau.Model.Lecturer;
import lk.ac.vau.Repo.LectureRepo;
//import lk.ac.vau.Repo.Repo;

@RestController
@RequestMapping("lecturer")
//Output in XML
@Produces(MediaType.APPLICATION_ATOM_XML_VALUE)
//Input in XML
@Consumes(MediaType.APPLICATION_ATOM_XML_VALUE)
public class LecturerController {

 
	
	//private Repo<Long, Lecturer> lecturers=new Repo<Long, Lecturer>();
	
	private LectureRepo lecturers=new LectureRepo();
	//Get all Courses
	 @GetMapping
 	  public Collection<Lecturer>getAll(){
		//add();
		 return lecturers.getAll();
	 }
	 
	 /*Get ONE Courses*/
	 @GetMapping("/{id}")
	 public Lecturer get(@PathVariable("id") Long id)
	 {
		 	//add();
		 	return lecturers.get(id);
	 }
	 
	 //Add Courses
	 @PostMapping
	 public void add(@RequestBody Lecturer lecturer)
	 {
		 lecturers.add(lecturer);
	 }
	 
	
	 //Delete record
	 @DeleteMapping("/{id}")
	 public void delete(@PathVariable("id") Long id)
	 {
		 	 
		 lecturers.delete(id);
	 }
	 //Update a record
	 @PutMapping("/{id}")
	 public void update(@PathVariable("id") Long id,Lecturer lecturer)
	 {
		 	 
		 lecturers.update(id,lecturer);
	 }
	 

}
