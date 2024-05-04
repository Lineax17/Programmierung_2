package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.CollidingGameObject;

/**
 * Describing a static gameobject that looks like a turret.
 */
public class TurretBig extends CollidingGameObject {
    private TurretMovementPattern turretBigMovementPattern;

    /**
     * Initializes a new big turret.
     *
     * @param gameView Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public TurretBig(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
        this.turretBigMovementPattern = new TurretMovementPattern(this);
        super.size = 30;
        position.updateCoordinates(turretBigMovementPattern.startPosition());
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
        return "TurretBig: " + position;
    }

    @Override
    public void updatePosition() {
        position.moveToPosition(turretBigMovementPattern.nextTargetPosition(), speedInPixel);
        if (position.getY() > 720) {
            position.updateCoordinates(turretBigMovementPattern.startPosition());
        }
    }

    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas("turret_big.png", position.getX(), position.getY(), 2.0, rotation);
    }
}
