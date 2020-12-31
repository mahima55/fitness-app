package com.example.fitness_login;

import java.util.Random;

public class Randomstring {
    private final String LETTERS="abcdefghijklmnopqrstuvwxyz";
    private final String NUMBERS = "0123456789";
    private final char[] ALPHANUMERIC = (LETTERS + LETTERS.toUpperCase()+NUMBERS).toCharArray();

    public String generateAlphanumeric(int length){
        StringBuilder result =new StringBuilder();
        for(int i=0;i<length;i++){
            result.append(ALPHANUMERIC[new Random().nextInt(ALPHANUMERIC.length)]);
        }
        return result.toString();
    }
}
