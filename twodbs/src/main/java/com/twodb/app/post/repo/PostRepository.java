package com.twodb.app.post.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twodb.app.post.Entity.PostEntity;

@Repository
public interface PostRepository extends JpaRepository <PostEntity, Long>{

}
