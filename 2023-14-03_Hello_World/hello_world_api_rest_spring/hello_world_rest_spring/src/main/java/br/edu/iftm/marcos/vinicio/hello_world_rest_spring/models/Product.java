package br.edu.iftm.marcos.vinicio.hello_world_rest_spring.models;

import java.util.Date;
import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private Date date;

    public Product() {
    }

    public Product(String name, double price, Date date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && name.equals(product.name) && date.equals(product.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, date);
    }
}
