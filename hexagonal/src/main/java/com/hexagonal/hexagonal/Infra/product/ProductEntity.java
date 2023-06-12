package com.hexagonal.hexagonal.Infra.product;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "product_seq")
    @SequenceGenerator(name = "product_seq",allocationSize = 1,sequenceName = "product_seq")
    private Integer id;
    private String name;
    private String description;
}
