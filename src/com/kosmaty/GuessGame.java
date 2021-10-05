package com.kosmaty;

import java.util.Random;


public class GuessGame {
    public final int size = new UserInput().userSize();
    private final int attempts = new UserInput().userAttempts();
    private int shoot;
    private final Random RNG = new Random();
    final int win = RNG.nextInt(size);
    boolean userWin = false;

    public void startGame() {
        System.out.println("pierwszy strzal");

        for (int x = 1; x <= attempts; x++) {
            userShoots();
            if (userWin) {
                break;
            }
        }
        if (!userWin) {
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



