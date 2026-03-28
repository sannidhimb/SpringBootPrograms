package com.example.addition.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="addition")
@Data
public class AddEntity {
    private int id;
     private int a;
    private int b;
    private int c;
}
