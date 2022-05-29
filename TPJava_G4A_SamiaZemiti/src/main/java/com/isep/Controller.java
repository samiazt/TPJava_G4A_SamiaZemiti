package com.isep;

import com.isep.rpg.BasicEnemy;
import com.isep.rpg.Boss;
import com.isep.rpg.Enemy;
import com.isep.rpg.Hero;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private VBox displayHero1;
    @FXML
    private VBox displayHero2;
    @FXML
    private VBox displayHero3;
    @FXML
    private VBox displayHero4;
    @FXML
    private VBox displayEnemy1;
    @FXML
    private VBox displayEnemy2;
    @FXML
    private VBox displayEnemy3;
    @FXML
    private VBox displayEnemy4;

    public void displayHero(Label name, ImageView sprite, int hero) {
        switch (hero) {
            case 0 -> {
                this.displayHero1.getChildren().add(name);
                this.displayHero1.getChildren().add(sprite);
            }
            case 1 -> {
                this.displayHero2.getChildren().add(name);
                this.displayHero2.getChildren().add(sprite);
            }
            case 2 -> {
                this.displayHero3.getChildren().add(name);
                this.displayHero3.getChildren().add(sprite);
            }
            case 3 -> {
                this.displayHero4.getChildren().add(name);
                this.displayHero4.getChildren().add(sprite);
            }
        }
    }


    private void displayEnemy(Label name, ImageView sprite, int enemy) {
        switch (enemy) {
            case 0 -> {
                this.displayEnemy1.getChildren().add(name);
                this.displayEnemy1.getChildren().add(sprite);
            }
            case 1 -> {
                this.displayEnemy2.getChildren().add(name);
                this.displayEnemy2.getChildren().add(sprite);
            }
            case 2 -> {
                this.displayEnemy3.getChildren().add(name);
                this.displayEnemy3.getChildren().add(sprite);
            }
            case 3 -> {
                this.displayEnemy4.getChildren().add(name);
                this.displayEnemy4.getChildren().add(sprite);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (Hero hero : SpecialController.heroes) {
            hero.potions = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                hero.givePotion();
            }
            hero.lembas = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                hero.giveFood();
            }
        }
        ArrayList<Enemy> enemies = new ArrayList<>();
        Random random = new Random();
        int randomFight = random.nextInt(5);
        if(randomFight == 0) {
            Enemy boss = new Boss();
            Enemy enemy1 = new BasicEnemy();
            Enemy enemy2 = new BasicEnemy();
            enemies.add(boss);
            enemies.add(enemy1);
            enemies.add(enemy2);
            for (int i = 0; i < enemies.size(); i++) {
                Label name = new Label();
                if(enemies.get(i).name.equals("Ogre")) {
                    name.setText(enemies.get(i).name);
                } else {
                    name.setText(enemies.get(i).name + " " + i);
                }
                name.setStyle("-fx-font: bold 24px BiauKai; -fx-text-fill: white;");
                displayEnemy(name, enemies.get(i).sprite, i);
            }
        } else{
            for (int i = 0; i < SpecialController.heroes.size(); i++) {
                Enemy enemy = new BasicEnemy();
                enemies.add(enemy);
                Label name = new Label();
                name.setText(enemies.get(i).name + " " + (i + 1));
                name.setStyle("-fx-font: bold 24px BiauKai; -fx-text-fill: white;");
                displayEnemy(name, enemies.get(i).sprite, i);
            }
        }
    }
}
