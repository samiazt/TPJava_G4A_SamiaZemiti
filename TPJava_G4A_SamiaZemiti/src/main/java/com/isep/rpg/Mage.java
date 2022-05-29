package com.isep.rpg;

import javafx.scene.image.ImageView;

public class Mage extends SpellCaster {

    public Mage (){
        // Le héro mage a par défaut 10 points de vie, 2 point d'armure,
        // 20 points de mana et consomme 3 points de mana par sort
        this.sprite = new ImageView(String.valueOf(getClass().getResource("/images/heroes/Mage.png")));
        this.lifePoints = 10;
        this.armor = 1;
        this.manaPoints = 20;
        this.manaConsomme = 3;
    }
}


