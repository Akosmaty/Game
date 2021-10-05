package com.kosmaty;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public int size = new UserInput().UserSize();
    private int attempts = new UserInput().UserAttempts();
    Scanner userGuess = new Scanner(System.in);
    private int shoot;
    private Random RNG = new Random();
    int win = RNG.nextInt(size);

    public void StartGame() {
        System.out.println("pierwszy strzal");

        for (int x = 1; x <= attempts; x++) {
        UserShoots();
        }
        LoosScreen();


    }
    private void UserShoots(){
        shoot = new UserInput().UserGuess();
        if ((shoot == win)) {
            System.out.println("You win");
            System.exit(0);
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
    private void LoosScreen(){
        System.out.println("What a looser!!! ");
    }

}



