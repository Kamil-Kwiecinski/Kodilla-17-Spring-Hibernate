package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Rock, Paper, Scissors game! \nChoose level: ");
        System.out.println("1. Normal");
        System.out.println("2. Hard");
        String numbersOfLevel = scanner.next();


        switch (numbersOfLevel){
        case "1" -> game.normalGame();
        case "2" -> game.hardGame();
        }
    }
}
