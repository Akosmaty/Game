package com.kosmaty;

import java.util.Scanner;

public class UserInput {
    public int UserSize() {
        Scanner userinp = new Scanner(System.in);

        System.out.println("Jaka duzy zakres liczb chcesz uzyć");
        int userSize = userinp.nextInt();
        return  userSize;
    }

        public int UserAttempts(){
            Scanner userinp = new Scanner(System.in);
            System.out.println("Ile podjeść potrzebujesz");

            int userAttempts = userinp.nextInt();

            return userAttempts ;
        }




}
