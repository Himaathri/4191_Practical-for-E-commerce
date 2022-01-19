package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Project {

	
	@Id
	private String ID;
	private  String Name;
	private int Duration;
	private String Customer;
	@ManyToOne
	@JoinColumn(name="projectmanager",referencedColumnName ="ID" )
	private ProjectManager Manager;
	
	@OneToMany(mappedBy = "project")
	private List<Devoloper> devolopers;
	
	public Project(String iD, String name, int duration, String customer, ProjectManager manager,
			List<Devoloper> devolopers) {
		super();
		ID = iD;
		Name = name;
		Duration = duration;
		Customer = customer;
		Manager = manager;
		this.devolopers = devolopers;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}

	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}

	public ProjectManager getManager() {
		return Manager;
	}

	public void setManager(ProjectManager manager) {
		Manager = manager;
	}

	public List<Devoloper> getDevolopers() {
		return devolopers;
	}

	public void setDevolopers(List<Devoloper> devolopers) {
		this.devolopers = devolopers;
	}
	
	
	
	
}
