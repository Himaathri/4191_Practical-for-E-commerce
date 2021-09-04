package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 import lk.ac.vau.Model.Work;


@Repository
public interface WorkRepo extends JpaRepository<Work,Integer>{
	
}

