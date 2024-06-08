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
            overlay.showMessage("Level " + levelNumber, 2);
    }

    @Override
    protected void initializeGame() {
        super.initializeGame();
        initializeLevel();
    }

    private void gameManagement() {
        if (endOfGame()) {
            if (!overlay.isMessageShown()) {
                overlay.showMessage("Game Over");
            }
            if (gameView.timer(2000, this)) {
                overlay.stopShowing();
                startNewGame();
            }
        } else if (endOfLevel()) {
            if (!overlay.isMessageShown()) {
                overlay.showMessage("Great Job!");
            }
            if (gameView.timer(2000, this)) {
                overlay.stopShowing();
                switchToNextLevel();
                initializeLevel();
            }

        }
    }

    private boolean endOfGame() {
        return lives == 0 || (!hasNextLevel() && endOfLevel());
    }

    private boolean endOfLevel() {
        return gameView.timer(15000, this);
    }

    public void startNewGame() {
        Level.difficulty = Difficulty.EASY;
        initializeGame();
    }

    public Difficulty getDifficulty() {
        return Level.difficulty;
    }

}


























