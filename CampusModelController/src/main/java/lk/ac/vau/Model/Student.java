package lk.ac.vau.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student extends PrimaryId<String>{
	public Student() {}
	 
	private String Name;
	private int age;
	private String Degree;
	private double Gpa;
	public Student( String id, String name, int age, String degree, double gpa) {
		super(id);
		 
		Name = name;
		this.age = age;
		Degree = degree;
		Gpa = gpa;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	public double getGpa() {
		return Gpa;
	}
	public void setGpa(double gpa) {
		Gpa = gpa;
	}
	
	
}

