package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.Position;

import java.awt.*;

/**
 * Describes a object looking like a ball, that is moving towards a target.
 */
public class RandomBall {
    private final QuadraticMovementPattern quadraticMovementPattern;
    private final GameView gameView;
    private final Position position;
    private double speedInPixel;
    private double rotation;
    private final Position targetPosition;
    private final double width;
    private final double height;
    private final RandomMovementPattern randomMovementPattern;
    private boolean stop;

    /**
     * Intializes a new RandomBall.
     *
     * @param gameView Instance of {@link GameView}.
     */
    public RandomBall(GameView gameView) {
        this.quadraticMovementPattern = new QuadraticMovementPattern();
        this.randomMovementPattern = new RandomMovementPattern();
        this.gameView = gameView;
        this.position = new Position();
        position.updateCoordinates(new RandomMovementPattern().startPosition());
        this.speedInPixel = 4;
        this.targetPosition = new Position();
        targetPosition.updateCoordinates(quadraticMovementPattern.nextTargetPosition());
        this.width = 50;
        this.height = 50;
        this.stop = false;
    }

    /**
     * Returns a string.
     *
     * @return name of object and position.
     */
    @Override
    public String toString() {
        return "RandomBall: " + position;
    }

    /**
     * Adjusts the position of the game object using {@link Position}.
     *
     * @see Position
     */
    public void updatePosition() {
        if (gameView.timer(5000, this)) {
            speedInPixel++;
        }
        if (stop) {
            if (gameView.timer(2000, this)) {
                stop = false;
            }

        } else {
            if (gameView.timer(8000, this)) {
                stop = true;
            }
            if (position.similarTo(targetPosition)) {
                targetPosition.updateCoordinates(quadraticMovementPattern.nextTargetPosition());
            } else {
                position.moveToPosition(targetPosition, speedInPixel);
            }
        }
    }

    /**
     * Adds the object to the {@link GameView} canvas.
     *
     * @see GameView
     */
    public void addToCanvas() {
        if (gameView.gameTimeInMilliseconds() >= 5000) {
            gameView.addOvalToCanvas(position.getX(), position.getY(), 50, 50, 2, true, Color.RED);
        } else {
            gameView.addOvalToCanvas(position.getX(), position.getY(), 50, 50, 2, true, Color.YELLOW);
        }
        gameView.addOvalToCanvas(targetPosition.getX(), targetPosition.getY(), 50, 50, 2, false, Color.WHITE);
    }

    Position getPosition() {
        return position;
    }
}
