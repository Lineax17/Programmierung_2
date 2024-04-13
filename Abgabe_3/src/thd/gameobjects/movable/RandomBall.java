package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;
import java.awt.*;

/**
 * Describes a object looking like a ball, that is moving towards a target.
 */
public class RandomBall extends GameObject {
    private final QuadraticMovementPattern quadraticMovementPattern;
    private final RandomMovementPattern randomMovementPattern;
    private boolean stop;

    /**
     * Intializes a new RandomBall.
     *
     * @param gameView Instance of {@link GameView}.
     */
    public RandomBall(GameView gameView) {
        super(gameView);
        this.quadraticMovementPattern = new QuadraticMovementPattern();
        this.randomMovementPattern = new RandomMovementPattern();
        position.updateCoordinates(new RandomMovementPattern().startPosition());
        super.speedInPixel = 4;
        targetPosition.updateCoordinates(quadraticMovementPattern.nextTargetPosition());
        super.width = 50;
        super.height = 50;
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

    @Override
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

    @Override
    public void addToCanvas() {
        if (gameView.gameTimeInMilliseconds() >= 5000) {
            gameView.addOvalToCanvas(position.getX(), position.getY(), 50, 50, 2, true, Color.RED);
        } else {
            gameView.addOvalToCanvas(position.getX(), position.getY(), 50, 50, 2, true, Color.YELLOW);
        }
        gameView.addOvalToCanvas(targetPosition.getX(), targetPosition.getY(), 50, 50, 2, false, Color.WHITE);
    }


}
