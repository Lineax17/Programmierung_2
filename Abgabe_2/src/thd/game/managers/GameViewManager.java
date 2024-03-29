package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.movable.Alien;
import thd.gameobjects.movable.Ufo;
import thd.gameobjects.unmovable.Score;

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
