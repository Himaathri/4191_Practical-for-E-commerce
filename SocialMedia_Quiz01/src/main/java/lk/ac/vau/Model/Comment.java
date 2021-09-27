package lk.ac.vau.Model;

//import java.sql.Date;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Comment {
	@Id
	private Long CommentId;
	private String Comment;
	//@Column(columnDefinition = "datetime default now()")
	@Temporal(TemporalType.TIMESTAMP)
	private  Date CommentedOn;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Post_Id",referencedColumnName = "PostId")
	private Post CommentedIn;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UserId",referencedColumnName = "UserId")
	private User CommentedBy;

	public Comment(Long commentId, String comment, Date commentedOn, Post commentedIn, User commentedBy) {
		super();
		CommentId = commentId;
		Comment = comment;
		CommentedOn = commentedOn;
		CommentedIn = commentedIn;
		CommentedBy = commentedBy;
	}

	public Long getCommentId() {
		return CommentId;
	}

	public void setCommentId(Long commentId) {
		CommentId = commentId;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	public Date getCommentedOn() {
		return CommentedOn;
	}

	public void setCommentedOn(Date commentedOn) {
		CommentedOn = commentedOn;
	}
	@JsonIgnore
	public Post getCommentedIn() {
		return CommentedIn;
	}

	public void setCommentedIn(Post commentedIn) {
		CommentedIn = commentedIn;
	}
	@JsonIgnore
	public User getCommentedBy() {
		return CommentedBy;
	}

	public void setCommentedBy(User commentedBy) {
		CommentedBy = commentedBy;
	}
	
	
	
}
