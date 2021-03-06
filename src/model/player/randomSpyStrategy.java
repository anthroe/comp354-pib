/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.player;

import model.board.Bipartite;
import model.board.Card;
import model.board.Clue;

import java.util.List;
import java.util.Random;

/**
 * The random strategy for spymaster that will choose clues by random as they play the game.
 *
 * @author david
 */
public class randomSpyStrategy implements SpyStrategy {
    private String[] possibleClueWords = {"PLANT", "ANIMAL", "FURNITURE",
            "COUNTRY", "WEAPON", "PROFESSIONAL",
            "VEHICLE", "PLANET", "CONCEPT", "WEATHER"};

    /**
     * Returns a clue at random according to the amount of cards available.
     */
    @Override
    public Clue giveClue(List<Card> cards, Bipartite bipartite) {
        Random rand = new Random();
        int clueNum = rand.nextInt(4);

        String clueWord = possibleClueWords[rand.nextInt(possibleClueWords.length)];
        return new Clue(clueWord, clueNum);
    }

}
