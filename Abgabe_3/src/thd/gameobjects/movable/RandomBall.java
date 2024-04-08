package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.Position;

import java.awt.*;

public class RandomBall {
    private final GameView gameView;
    private final Position position;
    private final double speedInPixel;
    private double rotation;
    private final Position targetPosition;
    private final double width;
    private final double height;
    private final RandomMovementPattern randomMovementPattern;

    public RandomBall(GameView gameView) {
        this.randomMovementPattern = new RandomMovementPattern();
        this.gameView = gameView;
        this.position = new Position(randomMovementPattern.startPosition());
        this.speedInPixel = 4;
        this.targetPosition = new Position(randomMovementPattern.nextTargetPosition());
        this.width = 50;
        this.height = 50;
    }

    @Override
    public String toString() {
        return "RandomBall: " + position;
    }

    public void updatePosition() {
        if (position.similarTo(this.targetPosition)) {
            position.moveToPosition(targetPosition, speedInPixel);
        }
    }

    public void addToCanvas() {
        gameView.addOvalToCanvas(position.getX(), position.getY(), 50, 50, 2, true, Color.YELLOW);
        gameView.addOvalToCanvas(1000, 500, 50, 50, 2, false, Color.WHITE);
    }
}
