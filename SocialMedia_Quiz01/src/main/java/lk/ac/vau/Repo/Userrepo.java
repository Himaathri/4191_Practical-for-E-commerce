package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.Model.User;
@Repository
public interface  Userrepo extends JpaRepository<User,String>{

}
