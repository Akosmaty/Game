package com.kosmaty;

public class LeaveOrPlay {
    public void Choose() {


        if (true) {
            System.out.println("Czy chcesz grać dalej");
            System.out.println("jeżeli chcesz grac dalej kliknij Y");
            System.out.println("jezeli chcesz opuscic gra kliknij dowolny klawisz");
            UserInput userInput = new UserInput();
            String yesOrNo = userInput.UserEndGameChoos();
            if (yesOrNo.equals("Y")) {
                GuessGame newGame = new GuessGame();
                newGame.StartGame();
                Choose();
            } else {
                System.exit(0);


            }

        }
    }
}






