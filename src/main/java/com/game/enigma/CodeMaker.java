package com.game.enigma;

import java.util.*;

public class CodeMaker {

    public static List<Integer> computerMoves() {
        Random randomComputerCode = new Random();
        List<Integer> code = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
        for (int i = 0; i < 4; i++) {
            int n = randomComputerCode.nextInt(code.size());
            int x = code.get(n);
            code.remove(new Integer(x));
        }
        Collections.shuffle(code);
        return code;
    }
}