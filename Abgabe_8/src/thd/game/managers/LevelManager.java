package thd.game.managers;

import thd.game.level.Level1;
import thd.game.utilities.GameView;

public class LevelManager extends GameWorldManager{

    protected LevelManager(GameView gameView) {
        super(gameView);
    }

    @Override
    public void initializeLevel() {
        super.initializeLevel();
        super.level = new Level1();
    }
}
