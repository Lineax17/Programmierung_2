package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;

public class Head extends GameObject {
    private StaticRandomMovementPattern headMovementPattern;

    /**
     * Initializes a new head.
     *
     * @param gameView Instance of {@link GameView}.
     * @see GameView
     */
    public Head(GameView gameView) {
        super(gameView);
        this.headMovementPattern = new StaticRandomMovementPattern(this);
        super.size = 30;
        position.updateCoordinates(headMovementPattern.startPosition());
        super.rotation = 0;
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 2;
    }

    /**
     * Returns a string.
     *
     * @return name of object and position.
     */
    @Override
    public String toString() {
        return "Head: " + position;
    }

    @Override
    public void updatePosition() {
        position.moveToPosition(headMovementPattern.nextTargetPosition(), speedInPixel);
        if (position.getY() > 720) {
            position.updateCoordinates(headMovementPattern.startPosition());
        }
    }

    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas("head.png", position.getX(), position.getY(), 2.0, rotation);
    }
}
