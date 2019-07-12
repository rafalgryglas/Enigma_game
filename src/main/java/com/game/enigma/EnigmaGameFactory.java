package com.game.enigma;

import com.game.enigma.easyGame.EasyGame;
import com.game.enigma.hardGame.HardGame;
import com.game.enigma.standardGame.Game;
import com.game.enigma.standardGame.StandardGame;

public final class EnigmaGameFactory {
    public static final String EASYGAME = "EASYGAME";
    public static final String STANDARDGAME = "STANDARDGAME";
    public static final String HARDGAME = "HARDGAME";

    public final Game makeEnigmaGame(final String game) {
        switch (game) {
            case EASYGAME:
                return new EasyGame();
            case STANDARDGAME:
                return new StandardGame();
            case HARDGAME:
                return new HardGame();
            default:
                return null;
        }
    }
}
