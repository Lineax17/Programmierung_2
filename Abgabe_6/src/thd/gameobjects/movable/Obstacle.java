package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.CollidingGameObject;

/**
 * Describing a static gameobject that looks like a pyramid obstacle.
 */
public class Obstacle extends CollidingGameObject {
    private StaticRandomMovementPattern obstacleMovementPattern;

    /**
     * Initializes a new obstacle.
     *
     * @param gameView Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public Obstacle(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
        this.obstacleMovementPattern = new StaticRandomMovementPattern(this);
        super.size = 30;
        position.updateCoordinates(obstacleMovementPattern.startPosition());
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

    /**
     * Returns a string.
     *
     * @return name of object and position.
     */
    @Override
    public String toString() {
        return "Obstacle_1: " + position;
    }

    @Override
    public void updatePosition() {
        position.moveToPosition(obstacleMovementPattern.nextTargetPosition(), speedInPixel);
        if (position.getY() > 720) {
            position.updateCoordinates(obstacleMovementPattern.startPosition());
        }
    }

    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas("obstacle_1.png", position.getX(), position.getY(), 2.0, rotation);
    }
}
