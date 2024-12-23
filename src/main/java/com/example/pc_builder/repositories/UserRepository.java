package com.example.pc_builder.repositories;

import com.example.pc_builder.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
