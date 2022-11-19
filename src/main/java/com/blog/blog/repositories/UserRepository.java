package com.blog.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.blog.models.user.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}