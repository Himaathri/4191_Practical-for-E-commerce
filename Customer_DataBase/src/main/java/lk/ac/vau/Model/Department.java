package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Department {
	 @Id
	private int DeptId;
	private String Name;
	private String Faculty;
	private int No_ofstaff;
	@OneToMany(mappedBy = "department")
	//@Joincoloumn is used to show the foreign key.Mapped by is also a similar way
	//@JoinColumn(name="dept_id",referencedColumnName = "DeptId")
	public List<Employee> employees;
	
	
	
	public Department(int deptId, String name, String faculty, int no_ofstaff, List<Employee> employees) {
		super();
		DeptId = deptId;
		Name = name;
		Faculty = faculty;
		No_ofstaff = no_ofstaff;
		this.employees = employees;
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
	public int getNo_ofstaff() {
		return No_ofstaff;
	}
	public void setNo_ofstaff(int no_ofstaff) {
		No_ofstaff = no_ofstaff;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	

	
	

}
