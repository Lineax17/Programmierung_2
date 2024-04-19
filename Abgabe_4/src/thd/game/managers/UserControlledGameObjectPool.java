package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.movable.Alien;
import thd.gameobjects.movable.Gem;
import thd.gameobjects.movable.XWing;
import thd.gameobjects.unmovable.Score;

import java.awt.*;
import java.awt.event.KeyEvent;

public class UserControlledGameObjectPool {
    protected Alien alien;
    protected Gem gem;
    protected Score obstacle;

    protected XWing xwing;
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
