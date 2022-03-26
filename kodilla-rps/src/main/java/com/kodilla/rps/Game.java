package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private List<String> computerChoose = new ArrayList<>();

    public void addMoves() {
        computerChoose.add("Rock");
        computerChoose.add("Paper");
        computerChoose.add("Scissors");
    }

    public String getComputerChoose() {
        Random random = new Random();
        int number = 0;
        number = random.nextInt(3);
        return computerChoose.get(number);
    }

    public int roundDraw(String playerChoose, String computerChoose) {
        int draw = 0;
        if (playerChoose.equals(computerChoose) == true) {
            System.out.println("Computer choose " + computerChoose);
            System.out.println("You choose " + playerChoose + " \nDraw.");
            return draw;
        } else
            return 0;
    }

    public int roundForComputer(String playerChoose, String computerChoose) {
        int pointForComputer = 1;
        if(playerChoose.equals("Rock") && computerChoose.equals("Paper")) {
            System.out.println("You choose rock. Computer choose paper. \nWin for commputer.");
            return pointForComputer;
        } else if(playerChoose.equals("Scissors") && computerChoose.equals("Rock")) {
            System.out.println("You choose scissors. Computer choose rock. \nWin for commputer.");
            return pointForComputer;
        } else if(playerChoose.equals("Paper") && computerChoose.equals("Scissors")) {
            System.out.println("You choose paper. Computer choose scissors. \nWin for commputer.");
            return pointForComputer;
        } else
            return 0;
    }

    public int roundForPlayer(String playerChoose, String computerChoose){
        int pointForPlayer = 1;
        if (playerChoose.equals("Paper") && computerChoose.equals("Rock")){
            System.out.println("You choose paper. Computer choose rock. \nWin for you.");
            return pointForPlayer;
        } else if (playerChoose.equals("Rock") && computerChoose.equals("Scissors")){
            System.out.println("You choose rock. Computer choose scissors. \nWin for you.");
            return pointForPlayer;
        } else if (playerChoose.equals("Scissors") && computerChoose.equals("Paper")){
            System.out.println("You choose scissors. Computer choose paper. \nWin for you.");
            return pointForPlayer;
        } else {
            return 0;
        }
    }

    public void normalGame() {
        boolean end = false;
        int numberOfRounds = 0;
        int computerPoints = 0;
        int playerPoints = 0;
        Menu menu = new Menu("",0);
        menu.firstMenu();
        menu.secondMenu();
        menu.thirdMenu();
        String name = menu.getName();
        Game game = new Game();
        game.addMoves();
        Scanner scanner = new Scanner(System.in);

        while (!end) {
            numberOfRounds++;
            System.out.println("\nRound number: " + numberOfRounds + "\nEnter your choice:");
            String userChoice = scanner.next();
            String temporaryComputerChoose = game.getComputerChoose();
            switch (userChoice) {
                case "1" -> {
                    game.roundDraw("Rock", temporaryComputerChoose);
                    computerPoints = computerPoints + game.roundForComputer("Rock", temporaryComputerChoose);
                    playerPoints = playerPoints + game.roundForPlayer("Rock", temporaryComputerChoose);

                }
                case "2" -> {
                    game.roundDraw("Paper", temporaryComputerChoose);
                    computerPoints = computerPoints + game.roundForComputer("Paper", temporaryComputerChoose);
                    playerPoints = playerPoints + game.roundForPlayer("Paper", temporaryComputerChoose);
                }
                case "3" -> {
                    game.roundDraw("Scissors", temporaryComputerChoose);
                    computerPoints = computerPoints + game.roundForComputer("Scissors", temporaryComputerChoose);
                    playerPoints = playerPoints + game.roundForPlayer("Scissors", temporaryComputerChoose);
                }
                case "x" -> {
                    end = menu.quitGame();
                    numberOfRounds = numberOfRounds - 1;
                }
                case "n" -> numberOfRounds = playerPoints = computerPoints = menu.newGame(menu);
            }
            System.out.println("\nResult: \n" + name + "         Computer" + "\n" + playerPoints + "        -    " + computerPoints);

            if ((playerPoints == menu.getNumbersOfWinningGames()) || (computerPoints == menu.getNumbersOfWinningGames())) {
                System.out.println("\nX  End Game.\nN  New Game.");

                userChoice = scanner.next();
                switch (userChoice) {
                    case "x" -> {
                        end = menu.quitGame();
                        if (!end) {
                            numberOfRounds = playerPoints = computerPoints = menu.newGame(menu);
                        }
                    }
                    case "n" -> numberOfRounds = playerPoints = computerPoints = menu.newGame(menu);
                }
            }
        }
    }

    public void hardGame(){
        boolean end = false;
        int numberOfRounds = 0;
        int computerPoints = 0;
        int playerPoints = 0;
        Menu menu = new Menu("",0);
        menu.firstMenu();
        menu.secondMenu();
        menu.thirdMenu();
        String name = menu.getName();
        Game game = new Game();
        game.addMoves();
        Scanner scanner = new Scanner(System.in);

        while (!end) {
            numberOfRounds++;
            System.out.println("\nRound number: " + numberOfRounds + "\nEnter your choice:");
            String userChoice = scanner.next();
            switch (userChoice) {
                case "1" -> {
                    switch(game.hardRounds("Rock")) {
                        case 0 -> System.out.print("");
                        case 1 -> playerPoints++;
                        case 2 -> computerPoints++;
                    }
                }
                case "2" ->  {
                    switch(game.hardRounds("Paper")) {
                        case 0 -> System.out.print("");
                        case 1 -> playerPoints++;
                        case 2 -> computerPoints++;
                    }
                }
                case "3" ->  {
                    switch(game.hardRounds("Scissors")) {
                        case 0 -> System.out.print("");
                        case 1 -> playerPoints++;
                        case 2 -> computerPoints++;
                    }
                }
                case "x" -> {
                    end = menu.quitGame();
                    numberOfRounds = numberOfRounds - 1;
                }
                case "n" -> numberOfRounds = playerPoints = computerPoints = menu.newGame(menu);
            }
            System.out.println("\nResult: \n" + name + "         Computer" + "\n" + playerPoints + "        -    " + computerPoints);

            if ((playerPoints == menu.getNumbersOfWinningGames()) || (computerPoints == menu.getNumbersOfWinningGames())) {
                System.out.println("\nX  End Game.\nN  New Game.");

                userChoice = scanner.next();
                switch (userChoice) {
                    case "x" -> {
                        end = menu.quitGame();
                        if (!end) {
                            numberOfRounds = playerPoints = computerPoints = menu.newGame(menu);
                        }
                    }
                    case "n" -> numberOfRounds = playerPoints = computerPoints = menu.newGame(menu);
                }
            }
        }
    }

    public int hardRounds(String userChoice){
        Random random = new Random();
        String computerChoose;
        int chances = random.nextInt(3);
        if (chances == 1) {
            computerChoose = userChoice;
            roundDraw(userChoice, computerChoose);
            return 0;
        } else if (chances == 2) {
            if (userChoice.equals("Rock") == true) {
                roundForPlayer("Rock", "Scissors");
                return 1;
            } else if (userChoice.equals("Paper") == true) {
                roundForPlayer("Paper", "Rock");
                return 1;
            } else if (userChoice.equals("Scissors") == true) {
                roundForPlayer("Scissors", "Paper");
                return 1;
            } else {
                return 0;
            }
        } else {
            if (userChoice.equals("Rock") == true) {
                roundForComputer("Rock", "Paper");
                return 2;
            } else if (userChoice.equals("Paper") == true) {
                roundForComputer("Paper", "Scissors");
                return 2;
            } else if (userChoice.equals("Scissors") == true) {
                roundForComputer("Scissors", "Rock");
                return 2;
            }
            else {
                return 0;
            }
        }

    }
}
