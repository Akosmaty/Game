package com.kosmaty;

import java.util.Scanner;

public class UserInput {
    public int userSize() {
        Scanner userinp = new Scanner(System.in);

        System.out.println("Jaka duzy zakres liczb chcesz uzyć");
        int userSize = userinp.nextInt();
        return userSize;
    }

    public int userAttempts() {
        Scanner userinp = new Scanner(System.in);
        System.out.println("Ile podjeść potrzebujesz");

        int userAttempts = userinp.nextInt();

        return userAttempts;
    }

    public int userGuess() {
        Scanner userGuess = new Scanner(System.in);
        int usershoot = userGuess.nextInt();
        return usershoot;
    }

    public String userEndGameChoos() {
        Scanner userChoos = new Scanner(System.in);
        String yesOrNo = userChoos.nextLine();
        return yesOrNo;
    }


}
