package com.game.enigma.hardGame;

import java.util.*;

public class CodeMaker {

    public static List<Integer> computerMoves() {
        Random randomComputerCode = new Random();
        List<Integer> code = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        for (int i = 0; i < 5; i++) {
            int n = randomComputerCode.nextInt(code.size());
            int x = code.get(n);
            code.remove(new Integer(x));
        }
        Collections.shuffle(code);
        return code;
    }
}