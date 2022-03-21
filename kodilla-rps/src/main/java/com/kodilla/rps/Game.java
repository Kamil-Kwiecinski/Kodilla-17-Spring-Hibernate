package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private List<String> computerChoose = new ArrayList<>();

    public void addMoves() {
        computerChoose.add("Rock");
        computerChoose.add("Paper");
        computerChoose.add("Scissors");
    }

    public String getComputerChoose() {
        Random random = new Random();
        int number = random.nextInt(2);
        return computerChoose.get(number);
    }

    public int roundDraw(String playerChoose, String computerChoose) {
        int draw = 0;
        if (playerChoose == "Rock" && computerChoose == "Rock") {
            System.out.println("Rock's draw.");
            return draw;
        } else if (playerChoose == "Paper" && computerChoose == "Paper") {
            System.out.println("Paper's draw.");
            return draw;
        } else if (playerChoose == "Scissors" && computerChoose == "Scissors") {
            System.out.println("Scissors's draw.");
            return draw;
        } else
            return 0;
    }

    public int roundForComputer(String playerChoose, String computerChoose) {
        int pointForComputer = 1;
        if(playerChoose =="Rock" && computerChoose == "Paper") {
            System.out.println("You choose rock. Computer choose paper. \nWin for commputer.");
            return pointForComputer;
        } else if(playerChoose =="Scissors" && computerChoose == "Rock") {
            System.out.println("You choose scissors. Computer choose rock. \nWin for commputer.");
            return pointForComputer;
        } else if(playerChoose =="Paper" && computerChoose == "Scissors") {
            System.out.println("You choose paper. Computer choose scissors. \nWin for commputer.");
            return pointForComputer;
        } else
            return 0;
    }

    public int roundForPlayer(String playerChoose, String computerChoose){
        int pointForPlayer = 1;
        if (playerChoose == "Paper" && computerChoose == "Rock"){
            System.out.println("You choose paper. Computer choose rock. \nWin for you.");
            return pointForPlayer;
        } else if (playerChoose == "Rock" && computerChoose == "Scissors"){
            System.out.println("You choose rock. Computer choose scissors. \nWin for you.");
            return pointForPlayer;
        } else if (playerChoose == "Scissors" && computerChoose == "Paper"){
            System.out.println("You choose scissors. Computer choose paper. \nWin for you.");
            return pointForPlayer;
        } else {
            return 0;
        }
    }

    public void hardGame(String playerChoose){
        Random random = new Random();
        String computerChoose;
        int chances = random.nextInt(3);
        if (chances == 0){
            computerChoose = playerChoose;
            roundDraw(playerChoose, computerChoose);
        } else if (chances == 1) {
            if (playerChoose == "Rock") {
                computerChoose = "Scissors";
                roundForComputer(playerChoose, computerChoose);
            } else if (playerChoose == "Paper") {
                computerChoose = "Rock";
                roundForComputer(playerChoose, computerChoose);
            } else if (playerChoose == "Scissors") {
                computerChoose = "Paper";
                roundForComputer(playerChoose, computerChoose);
            } else {
            }
        }else {
            if (playerChoose == "Rock") {
                computerChoose = "Paper";
                roundForComputer(playerChoose, computerChoose);
            } else if (playerChoose == "Paper") {
                computerChoose = "Scissors";
                roundForComputer(playerChoose, computerChoose);
            } else if (playerChoose == "Scissors") {
                computerChoose = "Rock";
                roundForComputer(playerChoose, computerChoose);
            }
        }

    }
}
