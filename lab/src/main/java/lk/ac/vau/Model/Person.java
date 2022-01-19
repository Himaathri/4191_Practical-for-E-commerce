package lk.ac.vau.Model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
	@Id
	private String ID;
	private  String Name;
	private int Expeience;
	private String address;
	private String Phonenumber;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String iD, String name, int expeience, String address, String phonenumber) {
		super();
		ID = iD;
		Name = name;
		Expeience = expeience;
		this.address = address;
		Phonenumber = phonenumber;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getExpeience() {
		return Expeience;
	}

	public void setExpeience(int expeience) {
		Expeience = expeience;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return Phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}
	
	
	
	
	

}
