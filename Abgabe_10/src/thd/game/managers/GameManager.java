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
    }

    @Override
    protected void initializeGame() {
        super.initializeGame();
        initializeLevel();
    }

    private void gameManagement() {
        if (endOfGame()) {
            startNewGame();
        } else if (endOfLevel()) {
            switchToNextLevel();
            startNewGame();
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

}
