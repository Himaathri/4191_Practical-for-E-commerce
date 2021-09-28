
package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.Model.Course;
 @Repository
public interface   Courserepo extends JpaRepository<Course,String>{

}