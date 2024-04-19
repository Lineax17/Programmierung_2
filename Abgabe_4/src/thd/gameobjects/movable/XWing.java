package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;

import java.awt.*;

/**
 * Describing the main game object, which is controlled by the player.
 * The force is strong in this one.
 */
public class XWing extends GameObject {
    private boolean shotInProgress;

    /**
     * Initializes a new XWing.
     *
     * @param gameView Instance of {@link GameView}.
     * @see GameView
     */
    public XWing(GameView gameView) {
        super(gameView);
        super.size = 30;
        position.updateCoordinates(GameView.WIDTH / 2, 600);
        super.rotation = 0;
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 2;
        //shotInProgress = false;
    }

    /**
     * Returns a string.
     *
     * @return name of object and position.
     */
    @Override
    public String toString() {
        return "XWing: " + position;
    }

    @Override
    public void updatePosition() {

    }

    @Override
    public void addToCanvas() {
        if (shotInProgress) {
            gameView.addTextToCanvas("X", position.getX(), position.getY(), 50, true, Color.WHITE, rotation);
            shotInProgress = false;
        } else {
            gameView.addImageToCanvas("xwing.png", position.getX(), position.getY(), 2.0, rotation);
        }
    }

    public void right() {
        position.right(speedInPixel);
    }

    public void left() {
        position.left(speedInPixel);
    }

    public void down() {
        position.down(speedInPixel);
    }

    public void up() {
        position.up(speedInPixel);
    }

    public void shoot() {
        shotInProgress = true;
    }

    @Override
    public void updateStatus() {
        super.updateStatus();
        if (gameView.timer(5000, this)) {
            super.size++;
        }
    }
}
