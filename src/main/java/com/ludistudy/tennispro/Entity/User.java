package com.ludistudy.tennispro.Entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    private UUID id;

    private String name;
}