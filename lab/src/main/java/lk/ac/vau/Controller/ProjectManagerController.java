package lk.ac.vau.Controller;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.ProjectManager;
import lk.ac.vau.Repo.Repo;

@RestController
@RequestMapping("/manager")
@Produces(value= {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ProjectManagerController {
	
	@Autowired
	private ProjectManagerRepo repo;
	@GetMapping
	public ResponseEntity<List<ProjectManager>> getAll(){
		
		List <ProjectManager> managers =repo.findAll();
		return new  ResponseEntity<List<ProjectManager>>(managers, HttpStatus.FOUND);
			
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<List<ProjectManager>> getByName(@PathVariable("name") String name){
		
		List <ProjectManager> managers =repo.searchByName(name);
		return new  ResponseEntity<List<ProjectManager>>(managers, HttpStatus.FOUND);
		
		
	}

}
