package com.isep.rpg;

import org.testng.annotations.Test;

class AttackTest{
    @
    void testcorrectName(){
        Hero attack = new name("coup de feu") ;
        assertEquals("coup de feu", attack.getName()) ;
    }
}