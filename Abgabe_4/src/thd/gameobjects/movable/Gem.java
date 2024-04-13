package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;
/**
 * Describing a moving gameobject that increases the score when collected.
 */
public class Gem extends GameObject {
    private final GemMovementPattern gemMovementPattern;

    /**
     * Initializes a new gem.
     *
     * @param gameView Instance of {@link GameView}.
     * @see GameView
     */
    public Gem(GameView gameView) {
        super(gameView);
        super.size = 30;
        gemMovementPattern = new GemMovementPattern(this);
        position.updateCoordinates(gemMovementPattern.startPosition());
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 1;
    }

    /**
     * Returns a string.
     *
     * @return name of object and position.
     */
    @Override
    public String toString() {
        return "Gem: " + position;
    }

    @Override
    public void updatePosition() {
        position.updateCoordinates(gemMovementPattern.nextTargetPosition());

        if (position.getY() > 720) {
            position.updateCoordinates(gemMovementPattern.startPosition());
        }
    }


    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas("gem.png", position.getX(), position.getY(), 2.0, rotation);
    }
}


