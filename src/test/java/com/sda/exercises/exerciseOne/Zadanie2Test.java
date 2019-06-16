package com.sda.exercises.exerciseOne;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Zadanie2Test {

    @Test
    public void corectStringGetHelloWorld() {
        // given
        Zadanie2 zadanie2 = new Zadanie2();
        // when
        String returned = zadanie2.getHelloWorld();
        String expected = "Helo World";
        //then
        assertEquals(expected, returned);
    }
}