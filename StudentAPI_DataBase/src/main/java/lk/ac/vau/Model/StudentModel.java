package lk.ac.vau.Model;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class StudentModel {
	@Id
		private String Id;
		private String Name;
	//@Column(name="stu_name")
		private int age;
		private String Degree;
		private double Gpa;
		
		
		public StudentModel(String id,String name, int age, String degree, double gpa) {
			super();
			Id=id;
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
		public String getId() {
			return Id;
		}
		public void setId(String id) {
			Id=id;
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
