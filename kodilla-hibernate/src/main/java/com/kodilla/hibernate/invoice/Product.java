package com.kodilla.hibernate.invoice;
import com.kodilla.hibernate.task.Task;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class Product {
    private int id;
    private String name;

    public Product(){

    }

    public Product(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
    @NotNull
    @Column(name = "NAME")
    public String getName() {
        return name;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


}
