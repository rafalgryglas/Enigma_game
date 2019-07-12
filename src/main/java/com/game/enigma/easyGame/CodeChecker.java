package com.game.enigma.easyGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodeChecker {

    public static List<Integer> checker(List<Integer> computer, List<Integer> moves) {
        List<Integer> checkList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int a = moves.get(i);
            for (int n = 0; n < 3; n++) {
                int b = computer.get(n);
                if (a == b && i == n) {
                    checkList.add(100);
                } else if (a == b) {
                    checkList.add(50);
                }
            }
        }
        if (checkList.size() == 0) {
            for (int n = 0; n < 3; n++) {
                checkList.add(-1);
            }
        } else if (checkList.size() == 1) {
            for (int n = 0; n < 2; n++) {
                checkList.add(-1);
            }
        } else if (checkList.size() == 2) {
            checkList.add(-1);
        }
        Collections.sort(checkList);
        Collections.reverse(checkList);
        return checkList;
    }
}