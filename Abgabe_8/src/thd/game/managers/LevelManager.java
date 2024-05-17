package thd.game.managers;

import thd.game.level.Level;
import thd.game.level.Level1;
import thd.game.level.Level2;
import thd.game.level.Level3;
import thd.game.utilities.GameView;

import java.util.List;

public class LevelManager extends GameWorldManager {
    List<Level> levels;

    protected LevelManager(GameView gameView) {
        super(gameView);
        levels = List.of(new Level1(), new Level2(), new Level3());
        super.level = levels.get(0);
    }

    @Override
    public void initializeLevel() {
        super.initializeLevel();
        super.level = new Level1();
    }

    protected boolean HasNextLevel() {
        return levels.size() > 1;
    }

    protected void switchToNextLevel() {
        if (HasNextLevel()) {

        }
    }
}
