package com.isep.rpg;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

abstract public class Hero {
    public ImageView sprite;
    public String name;
    protected int lifePoints;
    protected int armor;
    public ArrayList<Potion> potions;
    public ArrayList<Food> lembas;

    public void givePotion(){
        Potion potion = new Potion();
        this.potions.add(potion);
    }

    public void giveFood(){
        Food food = new Food();
        this.lembas.add(food);
    }
}

// Mes héros possèdent tous un nom, des points de vie, des points d'armure, des points de dégât
// un inventaire (une liste) de potions et un inventaire (une liste) de nourritures
// Ils peuvent également tous attaquer, défendre, ou consommer un consommable
// Et ils peuvent recevoir plus de potions ou de nourritures
