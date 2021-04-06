package com.example.todo.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "todo_user")
public class todoUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idx;

    @Column(name = "name")
    private String name;

    @Column(name = "id")
    private String id;

    @Column(name = "password")
    private String password;

}
