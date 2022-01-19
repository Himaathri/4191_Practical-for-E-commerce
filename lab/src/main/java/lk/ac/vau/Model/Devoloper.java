package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

                                                    
@Entity
public class Devoloper extends Person {

	private String Programmingskills;
	
	@ManyToOne
	@JoinColumn(name="project",referencedColumnName ="ID" )
	private Project project;

	
	
	public Devoloper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Devoloper(String programmingskills, Project project) {
		super();
		Programmingskills = programmingskills;
		this.project = project;
	}
	public String getProgrammingskills() {
		return Programmingskills;
	}



	public void setProgrammingskills(String programmingskills) {
		Programmingskills = programmingskills;
	}



	public Project getProject() {
		return project;
	}



	public void setProject(Project project) {
		this.project = project;
	}
	
	
	
	
	
	

}
