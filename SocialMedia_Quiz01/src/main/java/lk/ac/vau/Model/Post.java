package lk.ac.vau.Model;

//import java.sql.Date;
import java.util.List;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Post {
	@Id
	private Long PostId;
	private String Title;
	private String Content;
	//@Column(columnDefinition = "datetime default now()")
	@Temporal(TemporalType.TIMESTAMP)
	private Date CreatedOn;
	  
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "user_id",referencedColumnName = "UserId")
	private User Owner;
	
	@OneToMany(mappedBy = "CommentedIn")
	private List<Comment> comments;
	public Post()
	{
		
	}
	public Post(Long postId, String title, String content, Date createdOn, User owner, List<Comment> comments) {
		super();
		PostId = postId;
		Title = title;
		Content = content;
		CreatedOn = createdOn;
		Owner = owner;
		this.comments = comments;
	}
	public Long getPostId() {
		return PostId;
	}
	public void setPostId(Long postId) {
		PostId = postId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public Date getCreatedOn() {
		return CreatedOn;
	}
	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}
	@JsonIgnore
	public User getOwner() {
		return Owner;
	}
	public void setOwner(User owner) {
		Owner = owner;
	}
	@JsonIgnore
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	
	
}
