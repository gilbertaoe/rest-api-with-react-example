package com.example.restapi.repositories;

import com.example.restapi.models.Bug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugsRepository extends JpaRepository<Bug, Long> {
    
}