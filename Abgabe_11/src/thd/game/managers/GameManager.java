package thd.game.managers;

import thd.game.level.Level;
import thd.game.level.Difficulty;
import thd.game.utilities.GameView;

class GameManager extends LevelManager {

    GameManager(GameView gameView) {
        super(gameView);

    }

    @Override
    protected void gameLoopUpdate() {
        super.gameLoopUpdate();
        gameManagement();
    }

    @Override
    protected void initializeLevel() {
        super.initializeLevel();
        overlay.showMessage("FTL JUMP TO: " + level.name, 2);
    }

    @Override
    protected void initializeGame() {
        super.initializeGame();
        initializeLevel();
    }

    private void gameManagement() {
        if (endOfGame()) {
            /*
            if (!overlay.isMessageShown()) {
                overlay.showMessage("Game Over");
            }
            if (gameView.timer(2000, this)) {
                overlay.stopShowing();
                startNewGame();
            }
             */
            overlay.showMessage("GAME OVER", 2);
            if (gameView.timer(3000, this)) {
                startNewGame();
            }
        } else if (endOfLevel()) {
            /*
            if (!overlay.isMessageShown()) {
                overlay.showMessage("Great Job!");
            }
            if (gameView.timer(2000, this)) {
                overlay.stopShowing();
                switchToNextLevel();
                initializeLevel();
            }
             */

            if (!endOfGame()) {

                switchToNextLevel();
                initializeLevel();
            }
        }
    }

    private boolean endOfGame() {
        return lives == 0 || (!hasNextLevel() && endOfLevel());
    }

    private boolean endOfLevel() {
        return gameView.timer(20000, this);
    }

    void startNewGame() {
        Level.difficulty = Difficulty.EASY;
        initializeGame();
    }
}


























