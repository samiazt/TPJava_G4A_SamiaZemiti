package com.rpglite.utils;

import javafx.scene.image.ImageView;

public class Hunter extends Hero {
    protected int arrows;

    public Hunter(){
        this.sprite = new ImageView(String.valueOf(getClass().getResource("/images/heroes/Hunter.png")));
        this.lifePoints = 15;
        this.armor = 2;
        this.arrows = 30;
        // Le héro chasseur a par défaut 15 points de vie, 3 point d'armure et 30 flèches
    }
}
