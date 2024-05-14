package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.ShiftableGameObject;

/**
 * Describing a moving enemy that looks like an alien.
 */
public class Alien extends CollidingGameObject implements ShiftableGameObject {
    private final AlienMovementPattern alienMovementPattern;
    private boolean stop;

    /**
     * Initializes a new alien.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public Alien(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
        this.alienMovementPattern = new AlienMovementPattern(this);
        stop = false;
        super.size = 30;
        position.updateCoordinates(alienMovementPattern.startPosition());
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
        return "Alien: " + position;
    }

    @Override
    public void updatePosition() {
        if (stop) {
            if (gameView.timer(500, this)) {
                stop = false;
            }
        } else {
            if (gameView.timer(8000, this)) {
                stop = true;
            }
            position.moveToPosition(alienMovementPattern.nextTargetPosition(), speedInPixel);
        }

        if (position.getY() > 720) {
            gamePlayManager.destroyGameObject(this);
        }
    }

    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas("alien.png", position.getX(), position.getY(), 2.0, rotation);
    }
}
