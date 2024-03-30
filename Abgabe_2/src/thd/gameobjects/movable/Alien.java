package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.Position;

/**
 * Describing a moving enemy that looks like an alien.
 */
public class Alien {
    private final GameView gameView;
    private final Position position;
    private final double speedInPixel;
    private double rotation;
    private final double size;
    private final double width;
    private final double height;

    /**
     * Initializes a new alien.
     *
     * @param gameView Instance of {@link GameView}.
     * @see GameView
     */
    public Alien(GameView gameView) {
        this.gameView = gameView;
        size = 30;
        position = new Position(0, GameView.HEIGHT / 2);
        rotation = 0;
        width = 150;
        height = 33;
        speedInPixel = 5;
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
        position.right(speedInPixel);
        rotation = rotation + 1;
    }

    /**
     * Adds the object to the {@link GameView} canvas.
     *
     * @see GameView
     */
    public void addToCanvas() {
        gameView.addImageToCanvas("alien.png", position.getX(), position.getY(), 2.0, rotation);
    }
}
