/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.player;

import model.board.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author david
 */
public class SpymasterTest {    
        Card[] cards;
    Board board;
    Bipartite bp;

    public SpymasterTest() {
    }
    
    @Before
    public void setUp() {
        cards = CardBuilder.buildAll();
        board = new Board(cards);
        bp = new Bipartite(board);
    }
    
    /**
     * Test of draw method, of class Board.
     */
    @Test
    public void testClue() {
        System.out.println("clue");

        Spymaster instance = new Spymaster(CardType.Blue, board, new randomSpyStrategy());
        Clue c = instance.makeMove(null,bp);
        assertNotEquals(c.getClueWord(), null);
        assertTrue(c.getClueNum() < 10 && c.getClueNum() >= 0);
        assertNotEquals(c, null);
    }

}