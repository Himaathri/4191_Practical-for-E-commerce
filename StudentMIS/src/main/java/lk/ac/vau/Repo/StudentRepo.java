package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.Model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, String> {

}
