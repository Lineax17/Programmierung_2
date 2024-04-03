package thd.gameobjects.unmovable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.Position;

import java.awt.*;

/**
 * Describing a not moving gameobject that counts the score of the player.
 */
public class Score {
    private final GameView gameView;
    private final Position position;
    private final double rotation;
    private final double size;
    private final double width;
    private final double height;

    /**
     * Initializes a new score.
     *
     * @param gameView Instance of {@link GameView}.
     * @see GameView
     */
    public Score(GameView gameView) {
        this.gameView = gameView;
        width = 150;
        height = 33;
        size = 30;
        position = new Position(GameView.WIDTH / 2 - 50, -8);
        rotation = 0;

    }

    /**
     * Returns a string.
     *
     * @return name of object and position.
     */
    @Override
    public String toString() {
        return "Score: " + position;
    }

    /**
     * Adjusts the position of the game object using {@link Position}.
     *
     * @see Position
     */
    public void updatePosition() {

    }

    /**
     * Adds the object to the {@link GameView} canvas.
     *
     * @see GameView
     */
    public void addToCanvas() {
        gameView.addTextToCanvas("000000",
                position.getX(), position.getY(),
                size, true, Color.WHITE, rotation);
    }
}
