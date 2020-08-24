package com.freshprint.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @Author Varadharajan on 24/08/20 21:18
 *
 */
@Getter
@Setter
@Entity
@Table(name="itemmaster")
public class ItemMaster {


    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String itemName;

    @Column(name = "description", length = 100)
    private String description;

}
