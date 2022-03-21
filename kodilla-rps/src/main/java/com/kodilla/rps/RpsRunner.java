package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        Menu menu = new Menu("",0);
        menu.firstMenu();
        menu.secondMenu();
        String name = menu.getName();

        Game game = new Game();
        game.addMoves();

        boolean end = false;
        int numberOfRounds = 0;
        int playerPoints = 0;
        int computerPoints = 0;
        Scanner scanner = new Scanner(System.in);

        while(!end){
            numberOfRounds++;
            System.out.println("\nRound number: " + numberOfRounds + "\nEnter your choice:");
            String userChoice = scanner.next();
            switch (userChoice) {
                case "1" -> {
                    String temporaryComputerChoose = game.getComputerChoose();
                    game.roundDraw("Rock", temporaryComputerChoose);
                    computerPoints = computerPoints + game.roundForComputer("Rock", temporaryComputerChoose);
                    playerPoints = playerPoints + game.roundForPlayer("Rock", temporaryComputerChoose);

                }
                case "2" -> {
                    String temporaryComputerChoose = game.getComputerChoose();
                    game.roundDraw("Paper", temporaryComputerChoose);
                    computerPoints = computerPoints + game.roundForComputer("Paper", temporaryComputerChoose);
                    playerPoints = playerPoints + game.roundForPlayer("Paper", temporaryComputerChoose);
                }
                case "3" -> {
                    String temporaryComputerChoose = game.getComputerChoose();
                    game.roundDraw("Scissors", temporaryComputerChoose);
                    computerPoints = +computerPoints + game.roundForComputer("Scissors", temporaryComputerChoose);
                    playerPoints = playerPoints + game.roundForPlayer("Scissors", temporaryComputerChoose);
                }
                case "x" -> menu.quitGame(end);
                case "n" -> {
                    System.out.println("New game.");
                    numberOfRounds = 0;
                    playerPoints = 0;
                    computerPoints = 0;
                    menu.firstMenu();
                    menu.secondMenu();
                }
            }
            System.out.println("\nResult: \n" + name + "         Computer"  + "\n" + playerPoints + "        -    " + computerPoints);

            if ((playerPoints == menu.getNumbersOfWinningGames()) || (computerPoints == menu.getNumbersOfWinningGames())){
                System.out.println("\nX  End Game.");
                System.out.println("N  New Game.");

                userChoice = scanner.next();
                switch (userChoice) {
                    case "x" -> menu.quitGame(end);

                    case "n" -> {
                        System.out.println("New game.");
                        numberOfRounds = 0;
                        playerPoints = 0;
                        computerPoints = 0;
                        menu.firstMenu();
                        menu.secondMenu();
                    }
                }
            }
        }
    }
}
