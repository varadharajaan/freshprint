package com.freshprint.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;



@Getter
@Setter
@Entity
@Table(name="order")
public class Order {

    @Id
    @GenericGenerator(name ="pass_id_gen" , strategy= "com.freshprint.model.SequenceIdGenerator")
    @GeneratedValue(generator = "pass_id")
    @Column(name = "ordernumber")
    private Long orderNumber;

    @NotBlank
    @NotNull(groups = ApiCaller.class)
    @Column(name = "orderdate")
    private LocalDate orderDate;

    @Column(name = "description", length = 100)
    private String description;
}
