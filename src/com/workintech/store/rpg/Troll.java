package com.workintech.store.rpg;

public class Troll extends Monster implements Bleedable {
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    public double attack() {
        return getDamage() + bleed();
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    @Override
    public double bleed(int lv) {
        return getDamage() * lv * 0.25;
    }
}
