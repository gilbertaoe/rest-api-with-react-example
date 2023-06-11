package com.example.restapi.repositories;

import com.example.restapi.models.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowersRepository extends JpaRepository<Flower, Long> {
    
}