package com.game.enigma.standardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EnigmaRow {
    private List<EnigmaElement> rowElements = new ArrayList<>();

    public EnigmaRow() {
        for (int i = 0; i <= 8; i++) {
            rowElements.add(new EnigmaElement());
        }
    }

    public List<EnigmaElement> getRowElements() {
        return rowElements;
    }

    @Override
    public String toString() {
        return rowElements.stream()
                .map(EnigmaElement::toString)
                .collect(Collectors.joining("|"));
    }
}