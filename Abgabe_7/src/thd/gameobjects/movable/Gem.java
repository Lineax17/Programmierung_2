package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.unmovable.Wall;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Describing a moving gameobject that increases the score when collected.
 */
public class Gem extends CollidingGameObject {
    private final Random random;
    private final List<CollidingGameObject> collidingGameObjectsForPathDecision;
    private boolean directionIsRight;
    private Wall wall;


    /**
     * Initializes a new gem.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @param wall            Instance if {@link Wall}.
     * @see GameView
     * @see GamePlayManager
     * @see Wall
     */
    public Gem(GameView gameView, GamePlayManager gamePlayManager, Wall wall) {
        super(gameView, gamePlayManager);
        random = new Random();
        this.wall = wall;
        decideDirection();
        super.size = 30;
        position.updateCoordinates(random.nextDouble(690 - 320 + 1) + 320, 0);
        collidingGameObjectsForPathDecision = new LinkedList<>();
        collidingGameObjectsForPathDecision.add(wall);
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 1;
        distanceToBackground = 20;
        hitBoxOffsets(0, 0, -130, 0);

    }

    private boolean decideDirection() {
        double randomDouble = random.nextDouble() * 10;
        if (randomDouble <= 5) {
            directionIsRight = false;
        } else {
            directionIsRight = true;
        }
        return directionIsRight;
    }

    @Override
    public void reactToCollisionWith(CollidingGameObject other) {
        if (other instanceof ShotBlockImages) {
            gamePlayManager.destroyGameObject(this);
            gamePlayManager.addPoints(100);
        }
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

        double x;
        if (directionIsRight) {
            x = position.getX() + 3;
        } else {
            x = position.getX() - 3;
        }
        double y = position.getY() + 5;
        position.updateCoordinates(x, y);

        for (CollidingGameObject collidingGameObject : collidingGameObjectsForPathDecision) {
            if (collidesWith(collidingGameObject)) {
                directionIsRight = true;
            }
        }


        if (position.getY() > 720) {
            gamePlayManager.destroyGameObject(this);
        }
    }


    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas("gem.png", position.getX(), position.getY(), 2.0, rotation);
    }
}


