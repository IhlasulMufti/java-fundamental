package com.juaracoding.oop;

public class Fruit {

    // state
    int grams;
    int calsPerGrams;

    // behavior
    int totalCalories(){
        return grams*calsPerGrams;
    }
}
