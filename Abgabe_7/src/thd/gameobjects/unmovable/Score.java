package thd.gameobjects.unmovable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;

import java.awt.*;

/**
 * Describing a not moving gameobject that counts the score of the player.
 */
public class Score extends GameObject {
    private int score;

    /**
     * Initializes a new score.
     *
     * @param gameView Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public Score(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
        super.width = 150;
        super.height = 33;
        super.size = 30;
        position.updateCoordinates(GameView.WIDTH / 2 - 50, -8);
        super.rotation = 0;
        score = gamePlayManager.getPoints();
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
        gameView.addTextToCanvas(String.valueOf(score),
                position.getX(), position.getY(),
                size, true, Color.WHITE, rotation);
    }

    @Override
    public void updateStatus() {
        score = gamePlayManager.getPoints();
    }
}
