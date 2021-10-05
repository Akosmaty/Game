package com.kosmaty;

import java.util.Random;


public class GuessGame {
    public int size = new UserInput().userSize();
    private int attempts = new UserInput().userAttempts();
    private int shoot;
    private Random RNG = new Random();
    int win = RNG.nextInt(size);
    boolean userWin = false;

    public void startGame() {
        System.out.println("pierwszy strzal");

        for (int x = 1; x <= attempts; x++) {
            userShoots();
            if (userWin == true) {
                break;
            }
        }
        if (userWin == false) {
            loseScreen();
        }


    }

    private void userShoots() {
        shoot = new UserInput().userGuess();
        if ((shoot == win)) {
            System.out.println("You win");
            userWin = true;

        } else {
            upOrDown();

        }

    }

    private void upOrDown() {

        if (shoot > win) {
            System.out.println("nizej");

        } else {
            System.out.println("wyzej");
        }
    }

    private void loseScreen() {
        System.out.println("What a looser!!! ");
    }

}



