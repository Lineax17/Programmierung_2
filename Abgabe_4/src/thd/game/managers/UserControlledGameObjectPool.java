package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.movable.Alien;
import thd.gameobjects.movable.Gem;
import thd.gameobjects.movable.XWing;
import thd.gameobjects.unmovable.Score;

import java.awt.*;
import java.awt.event.KeyEvent;

public class UserControlledGameObjectPool {
    protected final Alien alien;
    protected final Gem gem;
    protected final Score obstacle;

    protected final XWing xwing;
    protected final GameView gameView;

    UserControlledGameObjectPool(GameView gameView) {
        this.gameView = gameView;
        alien = new Alien(gameView);
        gem = new Gem(gameView);
        obstacle = new Score(gameView);
        xwing = new XWing(gameView);
    }

    protected void gameLoopUpdate() {
        Integer[] pressedKeys = gameView.keyCodesOfCurrentlyPressedKeys();
        for (int keyCode : pressedKeys) {
            if (keyCode == KeyEvent.VK_A) {
                gameView.addTextToCanvas("Taste A gedrückt", 0, 0, 18, true, Color.WHITE, 0);
            }
        }
    }

}
