package lk.ac.vau.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Comment {
	@Id
	private Long CommentId;
	private String Comment;
	@Column(columnDefinition = "datetime default now()")
	private Date CommentedOn;
	
	@ManyToOne
	@JoinColumn(name = "Post_Id",referencedColumnName = "PostId")
	private Post CommentedIn;
	
	@ManyToOne
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

	public Post getCommentedIn() {
		return CommentedIn;
	}

	public void setCommentedIn(Post commentedIn) {
		CommentedIn = commentedIn;
	}

	public User getCommentedBy() {
		return CommentedBy;
	}

	public void setCommentedBy(User commentedBy) {
		CommentedBy = commentedBy;
	}
	
	
	
}
