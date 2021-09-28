package lk.ac.vau.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Product;
import lk.ac.vau.Repo.Productrepo;

@RestController
@RequestMapping("/product")
public class Productcontroller {

@Autowired
private Productrepo context;

@GetMapping
public List<Product> getAll()
{
	return context.findAll();
}

@GetMapping("/{id}")
public Product get(@PathVariable("id") String id)
{
	return context.findById(id).get();
}
@PostMapping
public void add(@RequestBody Product pro)
{
	context.save(pro);
}
@PutMapping
public void update(@RequestBody Product pro)
{
	context.save(pro);
}

@DeleteMapping("/{id}")
public void delete(@PathVariable("id") String id)
{
	context.deleteById(id);
}
}