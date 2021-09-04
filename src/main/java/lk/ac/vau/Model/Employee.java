package lk.ac.vau.Model;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Employee {
	@Id
	private int Eid;
	private int age;
	private String Name;
	private int Salary;
	
	//relationship between emp and dept
	@ManyToOne
	@JoinColumn(name="dept_id",referencedColumnName = "DId")
	private  Department department;
	
	//relationship between emp and wrk
	@ManyToMany(mappedBy = "work")
	private Work work;

	public Employee(int eid, int age, String name, int salary, Department department, Work work) {
		super();
		Eid = eid;
		this.age = age;
		Name = name;
		Salary = salary;
		this.department = department;
		this.work = work;
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Work getWork() {
		return work;
	}

	public void setWork(Work work) {
		this.work = work;
	}
	
	
	
	
	
	
}
