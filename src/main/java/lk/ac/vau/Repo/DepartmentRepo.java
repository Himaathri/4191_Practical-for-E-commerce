package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.Model.Department;
 

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer>{
	
}

 