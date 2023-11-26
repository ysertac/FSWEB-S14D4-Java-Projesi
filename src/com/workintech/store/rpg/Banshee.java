package com.workintech.store.rpg;

public class Banshee extends Monster implements Poisonable {

    public Banshee(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + poison();
    }

    @Override
    public double poison() {
        return getDamage() * 0.2;
    }

    @Override
    public double poison(int lv) {
        return getDamage() * lv * 0.2;
    }
}
