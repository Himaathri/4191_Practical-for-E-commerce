package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.Model.StudentModel;
@Repository
public interface SudentRepo extends JpaRepository<StudentModel, String>{

}
