package lk.ac.vau.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Customer;
import lk.ac.vau.Model.Product;
import lk.ac.vau.Repo.Customerrepo;
import lk.ac.vau.Repo.Productrepo;

@RestController
@RequestMapping("/customer")
public class Customercontroller {
@Autowired
private Customerrepo repo;
@Autowired
private Productrepo productrepo;
@GetMapping
public List<Customer> getAll()
{
	return repo.findAll();
}
@GetMapping("/{id}")
public Customer get(@PathVariable("id") Long id)
{
	return repo.findById(id).get();
}
@PostMapping
public void add(@RequestBody Customer cus)
{
	repo.save(cus);
}
@PutMapping
public void update(@RequestBody Customer cus)
{
	repo.save(cus);
}

@DeleteMapping("/{id}")
public void delete(@PathVariable("id") Long id)
{
	repo.deleteById(id);
}
@PostMapping("/{id}/addcustomer")
public void addcustomer(@PathVariable("id") Long id,@RequestBody Map<Long,String> productmap)
{
	Customer customer=repo.findById(id).get();
	Product product=productrepo.findById(productmap.get("productId")).get();
	customer.getProducts().add(product);
	repo.save(customer);
	
}
}