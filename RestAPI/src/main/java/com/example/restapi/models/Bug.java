package com.example.restapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Bugs")
public class Bug {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    
    public String Name;
    public String Type;
    public String ImagePath;
}