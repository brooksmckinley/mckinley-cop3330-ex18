/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testToCelsius() {
        Assertions.assertTrue(Math.abs(App.toCelsius(32)) < 0.0001);
        Assertions.assertTrue(Math.abs(App.toCelsius(10) - -12.22222) < 0.0001);
        Assertions.assertTrue(Math.abs(App.toCelsius(72) - 22.22222) < 0.0001);
    }

    @Test
    public void testToFahrenheit() {
        Assertions.assertTrue(Math.abs(App.toFahrenheit(0) - 32) < 0.0001);
        Assertions.assertTrue(Math.abs(App.toFahrenheit(-12.22222) - 10) < 0.0001);
        Assertions.assertTrue(Math.abs(App.toFahrenheit(22.22222) - 72) < 0.0001);
    }
}