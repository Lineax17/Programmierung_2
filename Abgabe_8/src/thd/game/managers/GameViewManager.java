package thd.game.managers;

import thd.game.utilities.GameView;

/**
 * Creates the GameView window.
 */

public class GameViewManager extends GameView {
    private GameManager gameManager;

    /**
     * Initializing the window with title, status text, and game icon.
     */
    @Override
    public void initialize() {
        setWindowTitle("Galg");
        setStatusText("Philipp Hartmann - Java Programmierung SS 2024");
        setWindowIcon("icon.png");
        gameManager = new GameManager(this);
        gameManager.initializeLevel();
    }

    /**
     * Starts the gameloop.
     */
    @Override
    public void gameLoop() {
        gameManager.gameLoopUpdate();
    }
}
