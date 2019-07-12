package com.game.enigma;

import com.game.enigma.standardGame.Game;

import java.util.Scanner;

public class AllGamesRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select difficulty ENIGMA level: \n" +
                    "(E)-easy, (S)-standard, (H)-hard, (X)-exit");
            String s = scanner.nextLine().toUpperCase();
            Game game = null;
            EnigmaGameFactory factory = new EnigmaGameFactory();
            if (s.equals("E")) {
                game = factory.makeEnigmaGame(EnigmaGameFactory.EASYGAME);
            } else if (s.equals("S")) {
                game = factory.makeEnigmaGame(EnigmaGameFactory.STANDARDGAME);
            } else if (s.equals("H")) {
                game = factory.makeEnigmaGame(EnigmaGameFactory.HARDGAME);
            } else if (s.equals("X")) {
                System.out.println("See you soon");
                return;
            } else {
                System.out.println("Wrong key, try: (E), (S), (H), (X)");
            }
            if (game != null) {
                game.playGame();
            }
        }
    }
}
