package com.isep.rpg;

import java.util.List;
import java.util.Scanner;

public abstract class Hero {
    private int LifePoints;
    private int Armor;
    private int WeaponDamage;
    private List<Potion> potions;
    private List<Food> lembas ;


    public void attack(){
    }
    public void defend(){
    }
    public void useComsumable(Consumable consumable){
    }

}
