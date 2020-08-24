package com.freshprint.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name="roles")
@Getter
@Setter
public class Role extends AuditEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(nullable=false, unique=true)
    @NotEmpty
    private String name;

    @ManyToMany(mappedBy="roles")
    private List<User> users;
}
