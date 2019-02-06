import control.game.GameHandler;
import control.game.PlayerControl;
import javafx.application.Application;
import javafx.stage.Stage;
import model.board.Board;
import model.board.Card;
import model.board.CardBuilder;
import view.GameScene;


public class Codenames extends Application {

    /*
    Entry Point of the program
    */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage root) {

        Card[] cards = CardBuilder.buildAll();
        Board board = new Board(cards);
        PlayerControl playerControl = new PlayerControl(board);
        root = GameScene.autoConfig(cards, new GameHandler(playerControl));
        root.show(); // Shows the final Stage based on the scene
    }
}