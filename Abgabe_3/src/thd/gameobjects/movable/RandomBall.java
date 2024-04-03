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

    public RandomBall(GameView gameView) {
        this.gameView = gameView;
        this.position = new Position(100, 100);
        this.speedInPixel = 4;
        this.targetPosition = new Position(1000, 500);
        this.width = 50;
        this.height = 50;
    }

    @Override
    public String toString() {
        return "RandomBall: " + position;
    }

    public void updatePosition() {
        if (position != targetPosition) {
            position.left();
            position.updateCoordinates(position.getX(), position.getY());
        }
    }

    public void addToCanvas() {
        gameView.addOvalToCanvas(100, 100, 50, 50, 2, true, Color.YELLOW);
        gameView.addOvalToCanvas(1000, 500, 50, 50, 2, false, Color.WHITE);
    }
}
