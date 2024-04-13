package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.Position;

/**
 * Describing a moving enemy that looks like an alien.
 */
public class Alien {
    private AlienMovementPattern alienMovementPattern;
    private final GameView gameView;
    private final Position position;
    private final double speedInPixel;
    private double rotation;
    private final double size;
    private final double width;
    private final double height;
    private boolean stop;

    /**
     * Initializes a new alien.
     *
     * @param gameView Instance of {@link GameView}.
     * @see GameView
     */
    public Alien(GameView gameView) {
        this.gameView = gameView;
        this.alienMovementPattern = new AlienMovementPattern(this);
        stop = false;
        size = 30;
        position = new Position(alienMovementPattern.startPosition());
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
        return "Alien: " + position;
    }

    /**
     * Adjusts the position of the game object using {@link Position}.
     *
     * @see Position
     */
    public void updatePosition() {
        if (stop) {
            if (gameView.timer(500, this)) {
                stop = false;
            }
        } else {
            if (gameView.timer(8000, this)) {
                stop = true;
            }
            position.moveToPosition(alienMovementPattern.nextTargetPosition(), speedInPixel);
        }

        if (position.getY() > 720) {
            position.updateCoordinates(alienMovementPattern.startPosition());
        }
    }

    /**
     * Adds the object to the {@link GameView} canvas.
     *
     * @see GameView
     */
    public void addToCanvas() {
        gameView.addImageToCanvas("alien.png", position.getX(), position.getY(), 2.0, rotation);
    }

    Position getPosition() {
        return position;
    }
}
