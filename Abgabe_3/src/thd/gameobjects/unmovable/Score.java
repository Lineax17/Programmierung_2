package thd.gameobjects.unmovable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;
import java.awt.*;

/**
 * Describing a not moving gameobject that counts the score of the player.
 */
public class Score extends GameObject {

    /**
     * Initializes a new score.
     *
     * @param gameView Instance of {@link GameView}.
     * @see GameView
     */
    public Score(GameView gameView) {
        super(gameView);
        super.width = 150;
        super.height = 33;
        super.size = 30;
        position.updateCoordinates(GameView.WIDTH / 2 - 50, -8);
        super.rotation = 0;

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

    @Override
    public void updatePosition() {

    }

    @Override
    public void addToCanvas() {
        gameView.addTextToCanvas("000000",
                position.getX(), position.getY(),
                size, true, Color.WHITE, rotation);
    }
}
