package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;

public class TurretSmall extends GameObject {
    private TurretMovementPattern turretSmallMovementPattern;

    /**
     * Initializes a new small turret.
     *
     * @param gameView Instance of {@link GameView}.
     * @see GameView
     */
    public TurretSmall(GameView gameView) {
        super(gameView);
        this.turretSmallMovementPattern = new TurretMovementPattern(this);
        super.size = 30;
        position.updateCoordinates(turretSmallMovementPattern.startPosition());
        super.rotation = 0;
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 2;
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
