package com.isep.rpg;

import java.util.List;

public abstract class Hero {
    private int LifePoints;
    private int Armor;
    private int WeaponDamage;
    private List<Potion> potions;
    private List<Food> lembas ;

    String name;

    public Hero(String name) {

    }

    public void attack(String name){
        this.name = name;
    }
    public String getName(){return name;}

    public void defend(){
    }
    public void useComsumable(Consumable consumable){
    }

}
