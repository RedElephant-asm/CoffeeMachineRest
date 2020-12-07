package org.CoffeeMachineRestApp.models;

import javax.persistence.*;

@Entity
@Table(schema = "Drinks", name = "Drinks")
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "portionCount")
    private Integer portionCount;

    @Column(name = "price")
    private Integer price;

    public Drink(){}

    public Drink(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPortionCount() {
        return portionCount;
    }

    public void setPortionCount(Integer portionCount) {
        this.portionCount = portionCount;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
