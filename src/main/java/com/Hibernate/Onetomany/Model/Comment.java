package com.Hibernate.Onetomany.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Lob
  private String content;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public Comment(Long id, String content) {
	this.id = id;
	this.content = content;
}

public Comment() {
}

@Override
public String toString() {
	return "Comment [id=" + id + ", content=" + content + "]";
}

  // getters and setters
  
}
