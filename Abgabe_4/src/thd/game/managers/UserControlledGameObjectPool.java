package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.movable.*;
import thd.gameobjects.unmovable.Score;

import java.awt.event.KeyEvent;

public class UserControlledGameObjectPool {
    protected Alien alien;
    protected Gem gem;
    protected Score score;
    protected XWing xwing;
    protected SpaceFrog spaceFrog;
    protected Head head;
    protected Obstacle obstacle_1;
    protected TurretBig turretBig;
    protected TurretSmall turretSmall;

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
