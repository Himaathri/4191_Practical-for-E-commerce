package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {
	
	@Id
	private String ProductId;
	private String Name;
	private String Companyname;
	@ManyToMany 
	private List<Customer> customers=new ArrayList<Customer>();
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Product(String productId, String name, String companyname, List<Customer> customers) {
		super();
		ProductId = productId;
		Name = name;
		Companyname = companyname;
		this.customers = customers;
	}



	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCompanyname() {
		return Companyname;
	}

	public void setCompanyname(String companyname) {
		Companyname = companyname;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	
		 
		 
}
