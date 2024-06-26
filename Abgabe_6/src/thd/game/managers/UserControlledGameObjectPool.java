package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.movable.*;
import thd.gameobjects.unmovable.Score;
import thd.gameobjects.unmovable.Wall;

import java.awt.event.KeyEvent;

class UserControlledGameObjectPool {
    Alien alien;
    Gem gem;
    Score score;
    XWing xwing;
    SpaceFrog spaceFrog;
    Head head;
    Obstacle obstacle1;
    TurretBig turretBig;
    TurretSmall turretSmall;
    Wall wall;
    private ShotBlockImages shotBlockImages;

    protected final GameView gameView;

    UserControlledGameObjectPool(GameView gameView) {
        this.gameView = gameView;

    }

    protected void gameLoopUpdate() {
        Integer[] pressedKeys = gameView.keyCodesOfCurrentlyPressedKeys();
        for (int keyCode : pressedKeys) {
            processKeyCode(keyCode);
        }
    }

    private void processKeyCode(int keyCode) {
        if (keyCode == KeyEvent.VK_A) {
            xwing.left();
        } else if (keyCode == KeyEvent.VK_D) {
            xwing.right();
        } else if (keyCode == KeyEvent.VK_W) {
            xwing.up();
        } else if (keyCode == KeyEvent.VK_S) {
            xwing.down();
        } else if (keyCode == KeyEvent.VK_SPACE) {
            xwing.shoot();
        }
    }

}
