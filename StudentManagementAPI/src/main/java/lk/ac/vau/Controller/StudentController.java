package lk.ac.vau.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Student;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Produces;
@RestController
@RequestMapping("student")
@Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)

 public class StudentController {
	/*
	 * store students
	 * add new student
	 * Update the student
	 * Delete the student
	 * get a student
	 * get students
	 * */

	//Array list way
	/* store students*/
	/*	
 List<Student>students=new ArrayList<Student>();
 
 public void add()
 {
	 Student james=new Student("2018-ICT-01","JamesPaul",24,"IT",3.0);
	 Student ravi=new Student("2018-ICT-02","Raviram",23,"IT",3.3);
	 Student mala=new Student("2018-ICT-03","Malathi",21,"IT",3.3);
	 students.add(james);
	 students.add(mala);
	 students.add(ravi);
 }
 //Get all students
 @GetMapping
  public List<Student>getAll(){
	add();
	 return students;
 }
 
 //Get ONE students
  @GetMapping("/{id}")
 public Student get(@PathVariable("id") String id)
 {
	 	add();
	for (Student student:students ) {
		 if (student.getId().equals(id)) {
			return student;
		}
		
	}
	return null;
 }
 */
	
	
//Mapping way
	//storing
 Map<String, Student> students=new HashMap<String, Student>();
 /*public void add()
 {
	 Student james=new Student("2018-ICT-01","JamesPaul",24,"IT",3.0);
	 Student ravi=new Student("2018-ICT-02","Raviram",23,"IT",3.3);
	 Student mala=new Student("2018-ICT-03","Malathi",21,"IT",3.3);
	 students.put(james.getId(), james);
	 students.put(ravi.getId(), ravi);
	 students.put(mala.getId(), mala);
	   
 }*/
 
//Get all students
 @GetMapping
  public Collection<Student>getAll(){
	//add();
	 return students.values();
 }
 
 /*Get ONE student*/
 @GetMapping("/{id}")
 public Student get(@PathVariable("id") String id)
 {
	 	//add();
	 	return students.get(id);
 }
 
 //Add student
 @PostMapping
 public void add(@RequestBody Student student)
 {
	 students.put(student.getId(),student);
 }
 
 
 public StudentController()
 {
	 Student james=new Student("2018-ICT-01","JamesPaul",24,"IT",3.0);
	 Student ravi=new Student("2018-ICT-02","Raviram",23,"IT",3.3);
	 Student mala=new Student("2018-ICT-03","Malathi",21,"IT",3.3);
	 students.put(james.getId(), james);
	 students.put(ravi.getId(), ravi);
	 students.put(mala.getId(), mala);
	   
 }
 
 //Delete a record
 @DeleteMapping("/{id}")
 public void delete(@PathVariable("id") String id)
 {
	 	 
	 	  students.remove(id);
 }
 
 //Update a record
 @PutMapping("/{id}")
 public void update(@PathVariable("id") String id,Student student)
 {
	 	 
	 	  students.put(id,student);
 }
}
