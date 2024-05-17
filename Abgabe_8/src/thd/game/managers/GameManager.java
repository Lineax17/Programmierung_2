package thd.game.managers;

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
            initializeGame();
        } else if (endOfLevel()) {
            switchToNextLevel();
            initializeLevel();
        }
    }

    private boolean endOfGame() {
        return lives == 0 || (!hasNextLevel() && endOfLevel());
    }

    //Not working properly
    private boolean endOfLevel() {
        return gameView.timer(3000, this) || endOfGame();
    }
}
