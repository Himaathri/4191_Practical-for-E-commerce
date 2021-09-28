package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Student {

	@Id
	private long StudentId;
	private String Name;
	private String Institute;
	
	@ManyToMany
	@JoinTable(name="student_course",
	joinColumns={@JoinColumn(name="student_id",referencedColumnName = "StudentId")},
	inverseJoinColumns ={@JoinColumn(name="course_id",referencedColumnName = "CourseId")})
	
	private List<Course> courses=new ArrayList<Course>();
	
	public Student() {}
	public Student(long studentId, String name, String institute, List<Course> courses) {
		super();
		StudentId = studentId;
		Name = name;
		Institute = institute;
		this.courses = courses;
	}
	public long getStudentId() {
		return StudentId;
	}
	public void setStudentId(long studentId) {
		StudentId = studentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getInstitute() {
		return Institute;
	}
	public void setInstitute(String institute) {
		Institute = institute;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
}

