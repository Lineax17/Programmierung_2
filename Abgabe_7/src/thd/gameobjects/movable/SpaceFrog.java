package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.ActivatableGameObject;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.ShiftableGameObject;

/**
 * Describes a gameobject looking like a frog.
 */
public class SpaceFrog extends CollidingGameObject implements ShiftableGameObject, ActivatableGameObject {
    private XWing xWing;

    /**
     * Initializes a new spacefrog.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public SpaceFrog(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
        super.size = 30;
        super.rotation = 0;
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 2;
        distanceToBackground = 10;
        hitBoxOffsets(0, 0, -120, 0);

    }

    @Override
    public void reactToCollisionWith(CollidingGameObject other) {
        if (other instanceof ShotBlockImages) {
            gamePlayManager.destroyGameObject(this);
            gamePlayManager.addPoints(10);
        }
    }

    /**
     * Returns a string.
     *
     * @return name of object and position.
     */
    @Override
    public String toString() {
        return "SpaceFrog: " + position;
    }

    @Override
    public void updatePosition() {
        if (position.getY() > 720) {
            gamePlayManager.destroyGameObject(this);
        }
    }

    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas("space_frog.png", position.getX(), position.getY(), 2.0, rotation);
    }

    @Override
    public boolean tryToActivate(Object info) {
        this.xWing = (XWing) info;
        return (xWing.getPosition().getY() - this.getPosition().getY()) < 720;
    }
}
