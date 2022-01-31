 package lk.ac.vau.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.validation.constraints.Email;

@Entity
public class Student {
	@Id
	@NotNull
	@Size(min = 9, max = 10, message = "Please check your Registration Number")
	private String RegNo;
	@NotEmpty(message = "Please enter the name")
	private String Name;
	@NotNull(message = "Please enter the Age")
	@Min(value = 20, message = "Age must be more than 20")
	private int Age;
	@NotNull(message = "Please enter the GPA")
	@Min(value = 0, message = "must be greater than 0")
	@Max(value = 4, message = "must be less than 4")
	private double GPA;
	@NotEmpty(message = "Please enter the Email")
	@Email(message = "Please check your Email id")
	private String Email;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date RegisteredOn;
	@NotEmpty(message = "Please select the Gender")
	private String Gender;
	@NotNull(message = "Please select the Department")
	@ManyToOne
	@JoinColumn(name = "Dept_Id",referencedColumnName = "DeptId")
	@JsonBackReference
	private Department department;

	public Student() {

	}

	public Student(String regNo, String name, int age, double gPA, String email, Date registeredOn,String gender, Department dept) {
		super();
		RegNo = regNo;
		Name = name;
		Age = age;
		GPA = gPA;
		Email = email;
		RegisteredOn = registeredOn;
		Gender = gender;
		department = dept;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getRegNo() {
		return RegNo;
	}

	public void setRegNo(String regNo) {
		RegNo = regNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Date getRegisteredOn() {
		return RegisteredOn;
	}

	public void setRegisteredOn(Date registeredOn) {
		RegisteredOn = registeredOn;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
