package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String c, int n, boolean hasFur) {
        this.color = c;
        numberOfPaws = n;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String fur = hasFur ? "a":"no";
        String paw = (numberOfPaws == 1) ? "paw" : "paws";
        return "This animal is mostly "+color+ ". It has "+numberOfPaws+ " "+paw+" and " + fur+ " fur.";
    }
}
