package com.kodilla.rps;

import java.util.Scanner;

public class Menu {
    private String name;
    private int numbersOfWinningGames;

    public Menu(String name, int numbersOfWinningGames) {
        this.name = name;
        this.numbersOfWinningGames = numbersOfWinningGames;
    }

    public String firstMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome in Rock, Paper, Scissors game!\nEnter your name:");
        name = scanner.next();
        return name;
    }

    public int secondMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of win games: ");
        numbersOfWinningGames = scanner.nextInt();
        return numbersOfWinningGames;
    }
    public void thirdMenu(){
        System.out.println("\nRemember those keys:");
        System.out.println("1. Rock.");
        System.out.println("2. Paper.");
        System.out.println("3. Scissors.");
        System.out.println("X  End Game.");
        System.out.println("N  New Game.");
    }

    public String getName() {
        return name;
    }

    public int getNumbersOfWinningGames() {
        return numbersOfWinningGames;
    }

    public boolean quitGame(){
        boolean end = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure to quit? y/n");
        String yesno = scanner.next();
        if (yesno.equals("y")) {
            end = true;
            return end;
        } else {
            return end;
        }
    }

    public int newGame(Menu menu){
        System.out.println("New game.");
        int numberOfRounds = 0;
        menu.firstMenu();
        menu.secondMenu();
        menu.thirdMenu();
        return numberOfRounds;
    }
}
