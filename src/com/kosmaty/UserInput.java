package com.kosmaty;

import java.util.Scanner;

public class UserInput {
    public int userSize() {
        Scanner userinp = new Scanner(System.in);

        System.out.println("Jaka duzy zakres liczb chcesz uzyć");
        return userinp.nextInt();
    }

    public int userAttempts() {
        Scanner userinp = new Scanner(System.in);
        System.out.println("Ile podjeść potrzebujesz");

        return userinp.nextInt();
    }

    public int userGuess() {
        Scanner userGuess = new Scanner(System.in);
        return userGuess.nextInt();
    }

    public String userEndGameChoos() {
        Scanner userChoos = new Scanner(System.in);
        return userChoos.nextLine();
    }


}
