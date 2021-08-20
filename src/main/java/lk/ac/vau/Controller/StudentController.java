package lk.ac.vau.Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Student;

@RestController
@RequestMapping("student")
public class StudentController {
	
	/*
	 * store students
	 * add new student
	 * Update the student
	 * Delete the student
	 * get a student
	 * get students
	 * */
	/*
	//1.Array list type 
	//store students
	static List<Student>students=new ArrayList<Student>();
	
	//get all students
		public void add()
	{

		Student james=new Student("2018-ICT-01", "JamesnPaul", 25, "IT", 3.5);
		 Student ravi=new Student("2018-ICT-02","Raviram",23,"IT",3.3);
		 Student mala=new Student("2018-ICT-03","Malathi",21,"IT",3.3);
		 
		 students.add(james);
		 students.add(ravi);
		 students.add(mala);
	}
	@GetMapping
	public   List<Student>getAll(){
		add();
		return students;
	} 
	//Get one student
	@GetMapping("/{id}")
	public Student get(@PathVariable("id") String id ) {
		add();
		for (Student student:students) {
			if(student.getId().equals(id)) {
				return student;
			}
		}
		return null;

	}
	*/
	//Mapping method
	Map<String, Student> students=new HashMap<String, Student>();
	/*
	public void add()
	 {
		 Student james=new Student("2018-ICT-01","JamesPaul",24,"IT",3.0);
		 Student ravi=new Student("2018-ICT-02","Raviram",23,"IT",3.3);
		 Student mala=new Student("2018-ICT-03","Malathi",21,"IT",3.3);
		 students.put(james.getId(), james);
		 students.put(ravi.getId(), ravi);
		 students.put(mala.getId(), mala);
		   
	 }
	*/
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
	 
}
