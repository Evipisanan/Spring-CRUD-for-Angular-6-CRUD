package com.example.apiforangularcrud.model;

import javax.persistence.*;

@Entity
@Table(name = "unit")
public class UserModel {

    @Id
    @GeneratedValue
    private int id;

    private String unit_name;
    private String unit_price;

    public UserModel() {
    }

    public UserModel(int id, String unit_name, String unit_price) {
        this.id = id;
        this.unit_name = unit_name;
        this.unit_price = unit_price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public String getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(String unit_price) {
        this.unit_price = unit_price;
    }
}
