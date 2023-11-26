package com.workintech.store.models;

import com.workintech.store.enums.Types;

public class Coke extends ProductForSale {

    private boolean hasSugar;
    private double size;

    public Coke(Types type, double price, String description, boolean hasSugar, double size) {
        super(type, price, description);
        this.size = size;
        this.hasSugar = hasSugar;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "hasSugar=" + hasSugar +
                ", size=" + size +
                '}';
    }
}
