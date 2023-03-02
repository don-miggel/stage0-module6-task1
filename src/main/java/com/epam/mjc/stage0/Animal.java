package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;

    }

    public String getDescription(){
        String hasFurStr = this.hasFur ? "a" : "no";
        String pawNum = this.numberOfPaws > 1 ? "paws" : "paw";
        return "This animal is mostly " +color+"."+" It has "+ numberOfPaws+" "+ pawNum + " and "+ hasFurStr+" fur.";

    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }
}
