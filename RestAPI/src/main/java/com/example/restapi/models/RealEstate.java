package com.example.restapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "estates")
public class RealEstate {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    public String Name;
    public String Description;
}