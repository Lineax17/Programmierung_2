package thd.game.managers;

import thd.game.utilities.GameView;

public class GameViewManager extends GameView {
    GameManager gameManager;


    @Override
    public void initialize() {
        gameManager = new GameManager(this);
    }

    @Override
    public void gameLoop() {
        gameManager.gameLoopUpdate();
    }
}
