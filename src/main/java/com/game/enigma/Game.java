package com.game.enigma;

import java.util.List;

public class Game {

    public boolean enigmaPlay() {
        EnigmaBoard board = new EnigmaBoard();
        List<Integer> computerCode = CodeMaker.computerMoves();
        while (true) {
            System.out.println(board);
            if (UserDialogs.firstViewDialogs()) {
                for (int i = 0; i < 10; i++) {
                    List<Integer> playerCode = UserDialogs.getMove(i);
                    board.setValue(i, 0, playerCode.get(0));
                    board.setValue(i, 1, playerCode.get(1));
                    board.setValue(i, 2, playerCode.get(2));
                    board.setValue(i, 3, playerCode.get(3));
                    board.setValue(i, 4, -1);
                    List<Integer> compCodeResult = CodeChecker.checker(computerCode, playerCode);
                    board.setValue(i, 5, compCodeResult.get(0));
                    board.setValue(i, 6, compCodeResult.get(1));
                    board.setValue(i, 7, compCodeResult.get(2));
                    board.setValue(i, 8, compCodeResult.get(3));
                    System.out.println(board);
                    Integer sum = 0;
                    for (int k = 0; k < 4; k++) {
                        sum += board.getValue(i, 5 + k);
                        if (sum == 400) {
                            i = -1;
                            board = new EnigmaBoard();
                            computerCode = CodeMaker.computerMoves();
                            if (!UserDialogs.oneMoreGame()) {
                                return false;
                            }
                        }
                    }
                }
                System.out.println("Correct code: " + computerCode.toString());
                UserDialogs.youLose();
            }
            return false;
        }
    }
}