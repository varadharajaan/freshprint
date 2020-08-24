package com.freshprint.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
@Getter
@Setter
public class User extends AuditEntity {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @JsonIgnore
    @Column(nullable=false)
    @NotBlank(message = "* First Name is required")
    private String firstname;

    @JsonIgnore
    @Column(name="middlename", nullable=true)
    private String middlename;

    @JsonIgnore
    @Column(nullable=false)
    @NotBlank(message = "* Last Name is required")
    private String lastname;

    @Column(nullable=false)
    @NotBlank(message = "* Password is required")
    @Size(min=8)
    private String password;

    @Column(nullable=false, unique=true)
    private String username;

    @JsonIgnore
    @Column(nullable=false, unique=true)
    @NotBlank(message = "* Email is required")
    @Email(message="{errors.invalid_email}")
    private String email;




    @JsonIgnore
    @ManyToMany(cascade=CascadeType.MERGE)
    @JoinTable(
            name="users_roles",
            joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="ID")},
            inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="ID")})
    private List<Role> roles;
}
