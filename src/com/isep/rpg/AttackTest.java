package com.isep.rpg;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class AttackTest extends Hero{

    @Test

public AttackTest(String name) {
    super(name);
}
    void testcorrectName(){
        Hero attack = new name("coup de feu") ;
        assertEquals("coup de feu", attack.getName()) ;
    }
}