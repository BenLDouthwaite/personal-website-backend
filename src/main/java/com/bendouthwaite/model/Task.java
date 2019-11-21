package com.bendouthwaite.model;

import lombok.Getter;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "task")
@Getter
public class Task implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;
}