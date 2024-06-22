package thd.gameobjects.unmovable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;

import java.awt.*;

public class LiveCounter extends GameObject {
    private int lives;

    /**
     * Initializes a new score.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public LiveCounter(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
        position.updateCoordinates(GameView.WIDTH - 200, -8);
        distanceToBackground = 50;
        super.size = 30;
        lives = gamePlayManager.getLives();
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
    public void addToCanvas() {
        gameView.addTextToCanvas("Lives: " + lives, position.getX(), position.getY(), size, true, Color.WHITE, rotation);
    }

    @Override
    public void updateStatus() {
        lives = gamePlayManager.getLives();
    }
}
