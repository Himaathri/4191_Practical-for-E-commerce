 package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
	@Id
	private String UserId;
 	private String EmailId;
	private String FirstName;
	private String LastName;
	private int Age;
	@Transient
	private List<Link>links=new ArrayList<Link>();
	@OneToMany(mappedBy = "Owner")
	public List<Post> posts;
	@OneToMany(mappedBy = "CommentedBy")
	public List<Comment> comments;
	
	public User() {
		
	}
 

	public User(String userId, String emailId, String firstName, String lastName, int age, List<Link> links,
			List<Post> posts, List<Comment> comments) {
		super();
		UserId = userId;
		EmailId = emailId;
		FirstName = firstName;
		LastName = lastName;
		Age = age;
		this.links = links;
		this.posts = posts;
		this.comments = comments;
	}


	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	@JsonIgnore
	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	@JsonIgnore
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}


	public List<Link> getLinks() {
		return links;
	}


	public void setLinks(List<Link> links) {
		this.links = links;
	}
	public void addLink(String uri, String rel) {
		Link link=new Link(uri,rel);
		links.add(link);
	}
	

}
