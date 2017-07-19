package io.model;

import java.io.Serializable;

/**
 * Created
 *
 */
public class Book implements Serializable {

    private static final long serialVersionUID = -7102431250189804176L;

    private String name;

    private Integer price;

    public Book(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
