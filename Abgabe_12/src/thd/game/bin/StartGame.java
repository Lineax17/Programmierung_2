package thd.game.bin;

import thd.game.managers.GameViewManager;

/**
 * Starts the game by using {@link GameViewManager}.
 *
 * @see GameViewManager
 */
public class StartGame {
    /**
     * Main method that starts the game.
     *
     * @param args Default main method parameter.
     */
    public static void main(String[] args) {
        GameViewManager gameViewManager = new GameViewManager();
        gameViewManager.startGame();
    }
}
