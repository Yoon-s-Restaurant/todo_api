package com.example.todo.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "todo_tag")
public class todoTagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idx;

    @Column(name = "list_idx")
    private String listIdx;

    @Column(name = "tag")
    private String tag;

}
