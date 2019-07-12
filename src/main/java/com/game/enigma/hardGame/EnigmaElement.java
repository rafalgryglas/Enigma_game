package com.game.enigma.hardGame;

public class EnigmaElement {
    private Integer value;
    private static Integer EMPTY = -1;

    public EnigmaElement() {
        this.value = EMPTY;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value.equals(EMPTY)) {
            return "   ";
        } else {
            return " " + value + " ";
        }
    }
}