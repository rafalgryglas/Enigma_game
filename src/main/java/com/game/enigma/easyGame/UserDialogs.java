package com.game.enigma.easyGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDialogs {

    public static boolean firstViewDialogs() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What would like to do? \n" +
                    "(1) - break the code, (2) - read rules, (X) - exit ");
            String userSelection = scanner.nextLine().toUpperCase();
            switch (userSelection) {
                case "1":
                    return true;
                case "2":
                    System.out.println("ENIGMA /MASTERMIND/ - become a codebreaker\n" +
                            "***On the left board side:*** \n" +
                            "Choose a three code number between '0-9'. Numbers can not be repeated\n" +
                            "***On the right board side:***\n" +
                            "Number '100' is placed for each code number from the guess\n" +
                            "which is correct in both - number and position.\n" +
                            "Number '50' indicates the existence of a correct code number \n" +
                            "placed in the wrong position\n" +
                            "You have 10 chance to break code. Good luck :)");
                    continue;
                case "X":
                    System.out.println("Oh no :( See you letter");
                    return false;
                default:
                    System.out.println("Wrong key, use (1), (2) or (X)");
            }
        }
    }

    public static List<Integer> getMove(int i) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give me your code, example '012'");
            String s = scanner.nextLine();
            if (s.length() != 3) {
                System.out.println("Code must have three numbers");
            } else {
                try {
                    int a = Integer.parseInt(s.substring(0, 1));
                    int b = Integer.parseInt(s.substring(1, 2));
                    int c = Integer.parseInt(s.substring(2, 3));
                    if (a > 10 || b > 10 || c > 10) {
                        System.out.println("Numbers between '0-9'!");
                    } else if (a == b || a == c || b == c) {
                        System.out.println("Numbers must be different");
                    } else {
                        List<Integer> playerMove = new ArrayList<>();
                        playerMove.add(a);
                        playerMove.add(b);
                        playerMove.add(c);
                        return playerMove;
                    }
                } catch (Exception e) {
                    System.out.println("Wrong data! Only numbers!");
                }
            }
        }
    }

    public static boolean oneMoreGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Congratulations. You've broken the code");
        while (true) {
            System.out.println("What's now? (N)-new code, (X)-exit");
            String s = scanner.nextLine().toUpperCase();
            if (s.equals("N")) {
                return true;
            } else if (s.equals("X")) {
                System.out.println("See you soon");
                return false;
            } else {
                System.out.println("Wrong key: use (N) or (X)");
            }
        }
    }

    public static void youLose() {
        System.out.println("3...\n2...\n1...");
        System.out.println("****BOOOOOM****");
        System.out.println("Game over");
    }
}