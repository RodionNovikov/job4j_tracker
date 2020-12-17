package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        System.out.println("=== Welcome to matches game === ");
        System.out.println("Rules: ");
        System.out.println("You have 11 maches on a table."
                + "Two players, from one by one mast take from 1 to 3 matches."
                + "Player whoever take last matches will win!");
        while (matches > 0) {
            System.out.println("Player 1: ");
            int select = Integer.valueOf(input.nextLine());
            System.out.print("Matches left: ");
            matches = matches - select;
            System.out.println(matches);
            if (matches == 0) {
                System.out.println("Player 1 wins!!!");
                break;
            }
            System.out.println("Player 2: ");
            int select2 = Integer.valueOf(input.nextLine());
            System.out.print("Matches left: ");
            matches = matches - select2;
            System.out.println(matches);
            if (matches == 0) {
                System.out.println("Player 2 wins!!!");
                break;
            }
        }
    }
}
