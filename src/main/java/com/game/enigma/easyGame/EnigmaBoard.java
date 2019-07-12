package com.game.enigma.easyGame;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EnigmaBoard {
    private List<EnigmaRow> rows = new ArrayList<>();

    public EnigmaBoard() {
        for (int n = 0; n <= 9; n++) {
            this.rows.add(new EnigmaRow());
        }
    }

    @Override
    public String toString() {
        return rows.stream()
                .map(n -> n.toString() + "\n")
                .collect(Collectors.joining());
    }

    public Integer getValue(int row, int col) {
        return rows.get(row).getRowElements().get(col).getValue();
    }

    public void setValue(int row, int col, Integer value) {
        rows.get(row).getRowElements().get(col).setValue(value);
    }
}