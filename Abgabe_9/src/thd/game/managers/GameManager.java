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

    //Revert after Abgabe_9
    private boolean endOfLevel() {
        return levelHasEnded();
        //return gameView.timer(10000, this);
    }

    private boolean levelHasEnded() {
        return gameView.timer(15000, this);
    }
}
