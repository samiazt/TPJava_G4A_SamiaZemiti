package com.isep.rpg;

import java.util.List;

public abstract class Hero {
    private int LifePoints;
    private int Armor;
    private int WeaponDamage;
    private List<Potion> potions;
    private List<Food> lembas ;

    protected Hero() {
    }

    public void attack(){
    }
    public void defend(){
    }
    public void useComsumable(Consumable consumable){
    }

}
