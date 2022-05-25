package com.rpglite.utils;

import javafx.scene.image.ImageView;

public class BasicEnemy extends Enemy {
    public BasicEnemy(){
        this.lifePoints = 10;
        this.name = "Goblin";
        this.sprite = new ImageView(String.valueOf(getClass().getResource("/images/enemies/Goblin.png")));
    }
}

// Mon ennemi de base est un gobelin avec 10 points de vie par défaut

