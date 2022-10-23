package com.gamblingsimulation;

import java.util.Random;

//UC -3 As a Calculative Gambler if won or lost 50% of the stake,would resign for the day
public class GamblerResignsForTheDay {
    final int betValue = 1;
    final int dailyStake = 100;
    final int wins = 0;
    final int losses = 0;
    final int count = 0;


    public static void main(String[] args) {
        GamblerResignsForTheDay gambling = new GamblerResignsForTheDay();
        System.out.println("Welcome to Gambling Simulation Problem");
        System.out.println("stake per day of gambler is " + gambling.dailyStake
                + " and bet is " + gambling.betValue);
        playGame(gambling, gambling.betValue, gambling.dailyStake, gambling.wins, gambling.losses);
    }


    public static void playGame(GamblerResignsForTheDay gambling, int betValue, int dailyStake,
                                int wins, int looses) {
        while(dailyStake!=0){
            Random random = new Random();
            int game = random.nextInt(2);
            if (game == 0) {
                dailyStake -= gambling.betValue;
                looses += 1;
                System.out.println("Gambler looses the bet");
                if (looses == 50) {
                    System.out.println("Gambler reached to max losses");
                    break;
                }
            } else {
                dailyStake += gambling.betValue;
                System.out.println("Gambler won the bet");
                wins += 1;
                if (wins == 50) {
                    System.out.println("Gambler reached to max wins");
                    break;
                }
            }
        }
        System.out.println("Total wins "+wins);
        System.out.println("Total looses "+looses);
    }
}
