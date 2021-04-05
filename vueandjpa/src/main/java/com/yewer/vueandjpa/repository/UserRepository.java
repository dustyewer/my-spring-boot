package com.yewer.vueandjpa.repository;

import com.yewer.vueandjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
