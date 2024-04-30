package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.GameObject;

/**
 * Describing a static gameobject that looks like a turret.
 */
public class TurretSmall extends CollidingGameObject {
    private TurretMovementPattern turretSmallMovementPattern;

    /**
     * Initializes a new small turret.
     *
     * @param gameView Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public TurretSmall(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
        this.turretSmallMovementPattern = new TurretMovementPattern(this);
        super.size = 30;
        position.updateCoordinates(turretSmallMovementPattern.startPosition());
        super.rotation = 0;
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 2;
        hitBoxOffsets(0, 0, -120, 0);

    }

    @Override
    public void reactToCollisionWith(CollidingGameObject other) {
        if (other instanceof ShotBlockImages) {
            gamePlayManager.destroyGameObject(this);
        }
    }

    @Override
    public String toString() {
        return "TurretSmall: " + position;
    }

    @Override
    public void updatePosition() {
        position.moveToPosition(turretSmallMovementPattern.nextTargetPosition(), speedInPixel);
        if (position.getY() > 720) {
            position.updateCoordinates(turretSmallMovementPattern.startPosition());
        }
    }

    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas("turret_small.png", position.getX(), position.getY(), 2.0, rotation);
    }
}
