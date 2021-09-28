 
package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.Model.Customer;
 @Repository
public interface   Customerrepo extends JpaRepository<Customer,Long>{

}
