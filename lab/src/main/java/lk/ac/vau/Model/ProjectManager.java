package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ProjectManager extends Person{

	private String  Skills;
	@OneToMany(mappedBy = "Manager")
	private List<Project>projects;
	
	
	public ProjectManager() {
		
	}
	
	public ProjectManager(String iD, String name, int expeience, String address, String phonenumber) {
		super(iD, name, expeience, address, phonenumber);
		// TODO Auto-generated constructor stub
	}


	public String getSkills() {
		return Skills;
	}

	public void setSkills(String skills) {
		Skills = skills;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	

}
