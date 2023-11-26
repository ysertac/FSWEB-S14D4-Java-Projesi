package com.workintech.store.models;

import com.workintech.store.enums.Types;

public class Chocolate extends ProductForSale {

    private String color;
    private boolean hasSugar;

    public Chocolate(Types type, double price, String description, String color, boolean hasSugar) {
        super(type, price, description);
        this.color = color;
        this.hasSugar = hasSugar;
    }
    @Override
    public void showDetails() {
        String productForSaleStr = super.toString();
        productForSaleStr += toString();
        System.out.println(productForSaleStr);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "color='" + color + '\'' +
                ", hasSugar=" + hasSugar +
                '}';
    }
}
