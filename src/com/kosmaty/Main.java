package com.kosmaty;

public class Main {

    public static void main(String[] args){

        GuessGame newGame = new GuessGame();
        LeaveOrPlay leaveOrPlay = new LeaveOrPlay();

          newGame.StartGame();
             leaveOrPlay.Choose();

    }
}
