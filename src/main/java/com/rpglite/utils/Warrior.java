package com.rpglite.utils;

import javafx.scene.image.ImageView;

public class Warrior extends Hero {
    public Warrior(){
        // Le héro guerrier a par défaut 25 points de vie, 5 point d'armure
        this.sprite = new ImageView(String.valueOf(getClass().getResource("/images/heroes/Warrior.png")));
        this.lifePoints = 25;
        this.armor = 3;
    }
}
