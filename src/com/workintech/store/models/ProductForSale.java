package com.workintech.store.models;

import com.workintech.store.enums.Types;

public abstract class ProductForSale {
    private Types type;
    private double price;
    private String description;

    public ProductForSale(Types type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public Types getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public abstract void showDetails();

    @Override
    public String toString() {
        return "ProductForSale{" +
                "type=" + type +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
