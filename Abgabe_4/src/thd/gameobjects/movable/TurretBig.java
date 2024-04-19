package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;

/**
 * Describing a static gameobject that looks like a turret.
 */
public class TurretBig extends GameObject{
    private TurretMovementPattern turretBigMovementPattern;

    /**
     * Initializes a new big turret.
     *
     * @param gameView Instance of {@link GameView}.
     * @see GameView
     */
    public TurretBig(GameView gameView) {
        super(gameView);
        this.turretBigMovementPattern = new TurretMovementPattern(this);
        super.size = 30;
        position.updateCoordinates(turretBigMovementPattern.startPosition());
        super.rotation = 0;
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 2;
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
