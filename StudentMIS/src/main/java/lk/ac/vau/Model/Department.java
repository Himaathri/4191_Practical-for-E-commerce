
package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Department {
	@Id
	private int DeptId;
	private String Name;
	private String Faculty;
	private String Head;
	@JsonManagedReference
	@OneToMany(mappedBy = "department")
	private List<Student>students;
	
	public Department() {
		
	}

	public Department(int deptId, String name, String faculty, String head, List<Student> students) {
		super();
		DeptId = deptId;
		Name = name;
		Faculty = faculty;
		Head = head;
		this.students = students;
	}

	public int getDeptId() {
		return DeptId;
	}

	public void setDeptId(int deptId) {
		DeptId = deptId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getFaculty() {
		return Faculty;
	}

	public void setFaculty(String faculty) {
		Faculty = faculty;
	}

	public String getHead() {
		return Head;
	}

	public void setHead(String head) {
		Head = head;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
