package com.kosmaty;

public class LeaveOrPlay {
    public void choose() {


        System.out.println("Czy chcesz grać dalej");
        System.out.println("jeżeli chcesz grac dalej kliknij Y");
        System.out.println("jezeli chcesz opuscic gra kliknij dowolny klawisz");
        UserInput userInput = new UserInput();
        String yesOrNo = userInput.userEndGameChoos();
        if (yesOrNo.equals("Y")) {
            GuessGame newGame = new GuessGame();
            newGame.startGame();
            choose();
        } else {
            System.exit(0);


        }

    }
}






