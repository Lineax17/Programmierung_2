package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.Position;

/**
 * Describing a moving gameobject that increases the score when collected.
 */
public class Gem {
    private final GameView gameView;
    private final Position position;
    private final GemMovementPattern gemMovementPattern;
    private final double speedInPixel;
    private final double rotation;
    private final double size;
    private final double width;
    private final double height;

    /**
     * Initializes a new gem.
     *
     * @param gameView Instance of {@link GameView}.
     * @see GameView
     */
    public Gem(GameView gameView) {
        this.gameView = gameView;
        size = 30;
        gemMovementPattern = new GemMovementPattern(this);
        position = new Position(gemMovementPattern.startPosition());
        rotation = 0;
        width = 150;
        height = 33;
        speedInPixel = 2;
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

    /**
     * Adjusts the position of the game object using {@link Position}.
     *
     * @see Position
     */
    public void updatePosition() {
        position.updateCoordinates(gemMovementPattern.nextTargetPosition());

        if (position.getY() > 720) {
            position.updateCoordinates(gemMovementPattern.startPosition());
        }
    }


    /**
     * Adds the object to the {@link GameView} canvas.
     *
     * @see GameView
     */
    public void addToCanvas() {
        gameView.addImageToCanvas("gem.png", position.getX(), position.getY(), 2.0, rotation);
    }

    Position getPosition() {
        return position;
    }
}


