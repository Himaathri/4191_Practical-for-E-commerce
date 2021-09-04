package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Department {
	
	@Id
	private int DId;
	private String DepartmentName;
	private double Budget;
	
	//relationship between emp and dept
	@OneToMany(mappedBy = "department")
	public List<Employee> employees;
	
	
	//relationship between wrk and dept
	@OneToOne(mappedBy = "wrk_department")
	public List<Work> work;


	public Department(int dId, String departmentName, double budget, List<Employee> employees, List<Work> work) {
		super();
		DId = dId;
		DepartmentName = departmentName;
		Budget = budget;
		this.employees = employees;
		this.work = work;
	}


	public int getDId() {
		return DId;
	}


	public void setDId(int dId) {
		DId = dId;
	}


	public String getDepartmentName() {
		return DepartmentName;
	}


	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}


	public double getBudget() {
		return Budget;
	}


	public void setBudget(double budget) {
		Budget = budget;
	}


	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	public List<Work> getWork() {
		return work;
	}


	public void setWork(List<Work> work) {
		this.work = work;
	}
	
	
	

}
