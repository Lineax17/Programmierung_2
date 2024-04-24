package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;

import java.awt.*;

/**
 * Describing the main game object, which is controlled by the player.
 * The force is strong in this one.
 */
public class XWing extends GameObject {

    /**
     * Initializes a new XWing.
     *
     * @param gameView Instance of {@link GameView}.
     * @see GameView
     */
    public XWing(GameView gameView) {
        super(gameView);
        super.size = 2;
        position.updateCoordinates(GameView.WIDTH / 2, 600);
        super.rotation = 0;
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 2;
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
        gameView.addImageToCanvas("xwing.png", position.getX(), position.getY(), size, rotation);
    }

    /**
     * Allows the main object to move right.
     */
    public void right() {
        position.right(speedInPixel);
    }

    /**
     * Allows the main object to move left.
     */
    public void left() {
        position.left(speedInPixel);
    }

    /**
     * Allows the main object to move down.
     */
    public void down() {
        position.down(speedInPixel);
    }

    /**
     * Allows the main object to move up.
     */
    public void up() {
        position.up(speedInPixel);
    }

    /**
     * Allows the main object to fire a shot.
     */
    public void shoot() {
    }

    @Override
    public void updateStatus() {

    }
}
