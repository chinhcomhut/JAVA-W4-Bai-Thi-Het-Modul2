package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "product_type")
public class TypeProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String type;

    @OneToMany(targetEntity = Product.class)
    private List<Product> productList;


    public TypeProduct() {
    }

    public TypeProduct(@NotEmpty String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
