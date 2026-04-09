package com.ludistudy.tennispro.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    private UUID id;

    private String name;

    private Integer age;

    private Double utrScore;

    private Integer experience;
}