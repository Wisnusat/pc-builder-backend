package com.example.pc_builder.repositories;

import com.example.pc_builder.models.PCBuild;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PCBuildRepository extends JpaRepository<PCBuild, Long> {
}