package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;
import thd.gameobjects.base.MainCharacter;

/**
 * Describing the main game object, which is controlled by the player.
 * The force is strong in this one.
 */
public class XWing extends GameObject implements MainCharacter {

    private int shotDurationInMilliseconds;

    /**
     * Initializes a new XWing.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public XWing(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
        size = 2;
        position.updateCoordinates(GameView.WIDTH / 2, 600);
        rotation = 0;
        width = 150;
        height = 33;
        speedInPixel = 2;
        shotDurationInMilliseconds = 300;
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

    @Override
    public void shoot() {
        if (gameView.timer(shotDurationInMilliseconds, this)) {
            gamePlayManager.spawnGameObject(new ShotBlockImages(gameView, gamePlayManager, this));
        }
    }

    @Override
    public void updateStatus() {

    }
}
