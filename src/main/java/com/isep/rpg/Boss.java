package com.isep.rpg;

import javafx.scene.image.ImageView;

public class Boss extends Enemy {
    public Boss(){
        this.lifePoints = 50;
        this.name = "Ogre";
        this.sprite = new ImageView(String.valueOf(getClass().getResource("/images/enemies/Ogre.png")));
    }
}

// Mon boss ennemi est un ogre avec 50 points de vie par défaut !
