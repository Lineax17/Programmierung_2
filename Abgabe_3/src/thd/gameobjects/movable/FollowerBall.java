package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.Position;

import java.awt.*;

public class FollowerBall {

    private final GameView gameView;
    private final Position position;
    private final double speedInPixel;
    private double rotation;
    private final Position targetPosition;
    private final double width;
    private final double height;
    private final RandomBall followMe;

    public FollowerBall(GameView gameView, RandomBall followMe) {
        this.followMe = followMe;
        this.gameView = gameView;
        this.position = new Position(0,0);
        this.speedInPixel = 3;
        this.targetPosition = new Position(followMe.getPosition());
        this.width = 50;
        this.height = 50;
    }

    @Override
    public String toString() {
        return "FollowerBall: " + position;
    }

    public void updatePosition() {
        targetPosition.updateCoordinates(followMe.getPosition());
        if (!position.similarTo(targetPosition)) {
            position.moveToPosition(targetPosition, speedInPixel);
        }
    }

    public void addToCanvas() {
        gameView.addOvalToCanvas(position.getX(), position.getY(), 50, 50, 2, true, Color.GREEN);
    }
}


