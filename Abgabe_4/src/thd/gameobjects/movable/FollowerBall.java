package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;

import java.awt.*;

/**
 * Describes a object looking like a ball, that is moving towards another ball.
 */
public class FollowerBall extends GameObject {
    private final RandomBall followMe;

    /**
     * Initializes a new FollowerBall.
     *
     * @param gameView Instance of {@link GameView}.
     * @param followMe The other ball.
     */
    public FollowerBall(GameView gameView, RandomBall followMe) {
        super(gameView);
        this.followMe = followMe;
        position.updateCoordinates(0, 0);
        super.speedInPixel = 3;
        targetPosition.updateCoordinates(followMe.getPosition());
        super.width = 50;
        super.height = 50;
    }

    /**
     * Returns a string.
     *
     * @return name of object and position.
     */
    @Override
    public String toString() {
        return "FollowerBall: " + position;
    }

    @Override
    public void updatePosition() {
        targetPosition.updateCoordinates(followMe.getPosition());
        if (!position.similarTo(targetPosition)) {
            position.moveToPosition(targetPosition, speedInPixel);
        }
    }

    @Override
    public void addToCanvas() {
        gameView.addOvalToCanvas(position.getX(), position.getY(), 50, 50, 2, true, Color.GREEN);
    }
}


