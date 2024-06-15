package thd.game.managers;

import thd.game.level.Level;
import thd.game.level.Difficulty;
import thd.game.utilities.FileAccess;
import thd.game.utilities.GameView;

class GameManager extends LevelManager {
    private FileAccess fileAccess;

    GameManager(GameView gameView) {
        super(gameView);
        fileAccess = new FileAccess();
    }

    @Override
    protected void gameLoopUpdate() {
        super.gameLoopUpdate();
        gameManagement();
    }

    @Override
    protected void initializeLevel() {
        super.initializeLevel();
        overlay.showMessage("WARP TO: " + level.name, 2);
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
        return gameView.timer(10000, this);
    }

    void startNewGame() {
        Difficulty difficulty = FileAccess.readDifficultyFromDisc();

        Level.difficulty = Difficulty.EASY;

        FileAccess.writeDifficultyToDisc(difficulty);

        Level.difficulty = difficulty;
        initializeGame();
    }
}


























