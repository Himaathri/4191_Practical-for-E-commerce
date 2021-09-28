package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
	@Id
	private long CustomerId;
	private String Name;
	private String Email;
	@ManyToMany
	@JoinTable(name="Customer_product",
	joinColumns={@JoinColumn(name="CustomerId",referencedColumnName = "CustomerId")},
	inverseJoinColumns ={@JoinColumn(name="ProductId",referencedColumnName = "ProductId")})
	
	private List<Product> products=new ArrayList<Product>();
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Customer(long customerId, String name, String email, List<Product> products) {
		super();
		CustomerId = customerId;
		Name = name;
		Email = email;
		this.products = products;
	}


	public long getCustomerId() {
		return CustomerId;
	}


	public void setCustomerId(long customerId) {
		CustomerId = customerId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
}
