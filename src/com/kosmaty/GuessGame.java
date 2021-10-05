package com.kosmaty;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public int size = new UserInput().UserSize();
    private int attempts = new UserInput().UserAttempts();
    Scanner userGuess = new Scanner(System.in);


    private Random RNG = new Random();
    int shoot = userGuess.nextInt();
    int win = RNG.nextInt(size);
    public void StartGame() {
        System.out.println("pierwszy strzal");

        for (int x = 1; x <= attempts; x++) {

            shoot = userGuess.nextInt();
            if ((shoot == win)) {
                System.out.println("You win");
                break;
            } else {
                UpOrDown();
                continue;
            }
        }



    }
    private void UpOrDown(){
        System.out.println("Strzelaj dalej");
        if (shoot > win) {
            System.out.println("nizej");

        }
        else {
            System.out.println("wyzej");
        }
    }
}



