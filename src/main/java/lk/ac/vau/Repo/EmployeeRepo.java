package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.Model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
	
}

