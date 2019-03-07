/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.game;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.MenuItem;

/**
 *
 * @author Max Page-Slowik
 */
public class Difficulty {

    private static int difficulty = 0;

    public  Difficulty() {
    }

    public static EventHandler<ActionEvent> setDifficulty() {
        return new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                MenuItem m = (MenuItem) event.getSource();
                String s = m.getText();
                if (s.equals("Easy")) {
                    difficulty = 0;
                } else if (s.equals("Medium")) {
                    difficulty = 1;
                } else if (s.equals("Hard")) {
                    difficulty = 2;
                }
            }
        };
    }
    public static int getDifficulty(){
        return difficulty;
    }
}
