package lk.ac.vau.Controller;

//import java.util.ArrayList;
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

import lk.ac.vau.Model.Student;
//import lk.ac.vau.Repo.Repo;
import lk.ac.vau.Repo.StudentRepo;

@RestController
@RequestMapping("student")
//Output in XML
@Produces(MediaType.APPLICATION_ATOM_XML_VALUE)
//Input in XML
@Consumes(MediaType.APPLICATION_ATOM_XML_VALUE)

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
	/////////////////////////////////////////////////////////////////////
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
	
	
	
	////////////////////////////////////////////////////////////////////////
	//MAPING METHOD
	/*
	
	Map<String, Student> students=new HashMap<String, Student>();
	
	 * used for get and add
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
	
	
	
	/*
	//Get all students
	 @GetMapping
 	  public Collection<Student>getAll(){
		//add();
		 return students.values();
	 }
	 
	 //Get ONE student
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
	 
	 
	  // used for update 
	 public StudentController()
	 {
		 Student james=new Student("2018-ICT-01","JamesPaul",24,"IT",3.0);
		 Student ravi=new Student("2018-ICT-02","Raviram",23,"IT",3.3);
		 Student mala=new Student("2018-ICT-03","Malathi",21,"IT",3.3);
		 students.put(james.getId(), james);
		 students.put(ravi.getId(), ravi);
		 students.put(mala.getId(), mala);
		   
	 }*/
	 
	 
	 
	 /*
	 //Delete record
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
	 
	 */

	
	///////////////////////////////////////////////////////////////////////
	//REPO WAY
		//Commen repo way
		//private Repo<String, Student> students=new Repo<String, Student>();
		
	
	//studentrepo way extends repo way
	private StudentRepo students=new StudentRepo();
	
		//Get all students
		 @GetMapping
	 	  public Collection<Student>getAll(){
			//add();
			 return students.getAll();
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
			 students.add(student);
		 }
		 
		
		 //Delete record
		 @DeleteMapping("/{id}")
		 public void delete(@PathVariable("id") String id)
		 {
			 	 
			 	  students.delete(id);
		 }
		 //Update a record
		 @PutMapping("/{id}")
		 public void update(@PathVariable("id") String id,Student student)
		 {
			 	 
			 	  students.update(id,student);
		 }
		 
	 
}
