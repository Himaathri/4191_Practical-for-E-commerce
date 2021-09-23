package lk.ac.vau.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	private  int EmpId;
	private String Name;
	private String Designation;
	private String Emptype;
	//@coloumn used to change the datatype
	@Column(columnDefinition="date")
	private String Appdate;
	@ManyToOne
	@JoinColumn(name="dept_id",referencedColumnName = "DeptId")
	private Department department;
	
		
	public Employee(int empId, String name, String designation, String emptype, String appdate, Department department) {
		super();
		EmpId = empId;
		Name = name;
		Designation = designation;
		Emptype = emptype;
		Appdate = appdate;
		this.department = department;
	}
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getEmptype() {
		return Emptype;
	}
	public void setEmptype(String emptype) {
		Emptype = emptype;
	}
 
	public String getAppdate() {
		return Appdate;
	}

	public void setAppdate(String appdate) {
		Appdate = appdate;
	}

	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	     
	
	
}
