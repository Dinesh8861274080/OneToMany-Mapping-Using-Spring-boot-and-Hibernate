package com.Hibernate.Onetomany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hibernate.Onetomany.Model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
