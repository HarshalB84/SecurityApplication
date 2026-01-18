package com.practice.SecurityApp.SecurityApplication.repositories;

import com.practice.SecurityApp.SecurityApplication.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
