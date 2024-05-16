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
    public void initializeLevel() {
        super.initializeLevel();
    }

    private void gameManagement() {

    }

}
