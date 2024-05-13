package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.CollidingGameObject;

/**
 * This class represents the left border of the game world.
 */
public class Wall extends CollidingGameObject {


    /**
     * Initializes a new wall.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public Wall(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
        hitBoxOffsets(0, 0, 0, 0);
    }

    @Override
    public void reactToCollisionWith(CollidingGameObject other) {

    }

    @Override
    public String toString() {
        return "Wall: " + position;
    }

    @Override
    public void updatePosition() {

    }

    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas("wall_inner.png", position.getX(), position.getY(), 1, rotation);

    }
}
