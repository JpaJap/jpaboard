package com.jpaspring.jpaboard.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
}
