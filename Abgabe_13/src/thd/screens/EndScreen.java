package thd.screens;

import thd.game.utilities.GameView;

/**
 * Displays the EndScreen with the Score.
 */
public class EndScreen {
    private final GameView gameView;

    /**
     * Initializes a new EndScreen.
     *
     * @param gameView Instance of {@link GameView}.
     */
    public EndScreen(GameView gameView) {
        this.gameView = gameView;
    }

    /**
     * Shows the EndScreen.
     *
     * @param score The score to be displayed.
     */
    public void showEndScreen(int score) {
        this.gameView.showEndScreen(
                "Game Over! " +
                "You have " + score + " Points!");
    }
}
