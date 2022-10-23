package com.gamblingsimulation;
// UC2 - As a Gambler make $1 bet so either win or loose $1

import java.util.Random;

public class GamblerWinOrLoose {

    public static final int dailyStake = 100;
    public static final int betValue = 1;

    public static void winOrLoose(int r, int betValue) {

        if (r == betValue) {
            System.out.println("Gambler wins!!!");
        } else {
            System.out.println("Gambler Loose!!!");
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation Problem");
        Random rand = new Random();
        int r = rand.nextInt(2);
        winOrLoose(r, betValue);
    }
}


