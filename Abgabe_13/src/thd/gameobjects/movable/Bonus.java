package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.ActivatableGameObject;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.ShiftableGameObject;

/**
 * Describes a game objects that gives a bonus in points.
 */
public class Bonus extends CollidingGameObject implements ActivatableGameObject<XWing>, ShiftableGameObject {


    /**
     * Initializes a new bonus.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public Bonus(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
        super.width = 64;
        super.height = 64;
        super.speedInPixel = 7;
        distanceToBackground = 20;
        hitBoxOffsets(0, 0, 0, 0);
    }


    @Override
    public void reactToCollisionWith(CollidingGameObject other) {
        if (other instanceof XWing) {
            gamePlayManager.destroyGameObject(this);
            gamePlayManager.addPoints(1000);
        }
    }

    /**
     * Returns a string.
     *
     * @return name of object and position.
     */
    @Override
    public String toString() {
        return "Bonus: " + position;
    }

    @Override
    public void updatePosition() {
        position.up(speedInPixel);
    }

    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas("bonus.png", position.getX(), position.getY(), 2.0, rotation);

    }


    @Override
    public boolean tryToActivate(XWing xWing) {
        return position.getY() > 800;
    }

}
