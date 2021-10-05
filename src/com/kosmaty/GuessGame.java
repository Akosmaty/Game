package com.kosmaty;

import java.util.Random;


public class GuessGame {
    public int size = new UserInput().UserSize();
    private int attempts = new UserInput().UserAttempts();
    private int shoot;
    private Random RNG = new Random();
    int win = RNG.nextInt(size);
    int userWin = 0;
    public void StartGame() {
        System.out.println("pierwszy strzal");

        for (int x = 1; x <= attempts; x++) {
            UserShoots();
            if (userWin == 1) {
                break;
            }
        }
        if (userWin == 0){
            LoseScreen();
        }


    }
    private void UserShoots(){
        shoot = new UserInput().UserGuess();
        if ((shoot == win)) {
            System.out.println("You win");
            userWin=1;

        } else {
            UpOrDown();

        }

    }
    private void UpOrDown(){

        if (shoot > win) {
            System.out.println("nizej");

        }
        else {
            System.out.println("wyzej");
        }
    }
    private void LoseScreen(){
        System.out.println("What a looser!!! ");
    }

}



