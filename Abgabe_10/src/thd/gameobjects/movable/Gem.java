package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.ActivatableGameObject;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.ShiftableGameObject;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Describing a moving gameobject that increases the score when collected.
 */
public class Gem extends CollidingGameObject implements ShiftableGameObject, ActivatableGameObject<XWing> {
    private final Random random;
    private final List<CollidingGameObject> collidingGameObjectsForPathDecision;
    private boolean directionIsRight;

    private enum State {
        STANDARD, EXPLODING
    }

    private State currentState;
    private StandardState standardState;
    private ExplodingState explodingState;
    private String imageName;

    /**
     * Initializes a new gem.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public Gem(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
        random = new Random();
        decideDirection();
        super.size = 30;
        position.updateCoordinates(random.nextDouble(690 - 320 + 1) + 320, 0);
        collidingGameObjectsForPathDecision = new LinkedList<>();
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 1;
        distanceToBackground = 20;
        currentState = State.STANDARD;
        standardState = StandardState.STANDARD_1;
        explodingState = ExplodingState.EXPLODING_1;
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
        if (other instanceof XWingShot) {
            switchToExplosion();
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
                directionIsRight = !directionIsRight;
            }
        }


        if (position.getY() > 720) {
            gamePlayManager.destroyGameObject(this);
        }
    }

    private enum ExplodingState {
        EXPLODING_1("explosion_1.png"),
        EXPLODING_2("explosion_2.png"),
        EXPLODING_3("explosion_3.png"),
        EXPLODING_4("explosion_4.png");


        private final String display;

        ExplodingState(String display) {
            this.display = display;
        }
    }

    private enum StandardState {
        STANDARD_1("gem_1.png"),
        STANDARD_2("gem_2.png"),
        STANDARD_3("gem_3.png"),
        STANDARD_4("gem_4.png");

        private final String display;

        StandardState(String display) {
            this.display = display;
        }
    }

    @Override
    public void updateStatus() {
        switch (currentState) {
            case STANDARD -> {
                imageName = standardState.display;
                if (gameView.timer(200, this)) {
                    switchToNextStandardState();
                }
            }
            case EXPLODING -> {
                imageName = explodingState.display;
                if (gameView.timer(80, this)) {
                    switchToNextExplosionState();
                }
            }
        }
    }

    private void switchToExplosion() {
        currentState = State.EXPLODING;
    }

    private void switchToNextStandardState() {
        int nextState = (standardState.ordinal() + 1) % StandardState.values().length;
        standardState = StandardState.values()[nextState];
    }

    private void switchToNextExplosionState() {
        int nextState = (explodingState.ordinal() + 1);
        if (nextState < ExplodingState.values().length) {
            explodingState = ExplodingState.values()[nextState];
        } else {
            gamePlayManager.destroyGameObject(this);
            gamePlayManager.addPoints(100);
        }
    }


    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas(imageName, position.getX(), position.getY(), 2.0, rotation);
    }

    /**
     * Adds walls to collision list to calculate collisions.
     *
     * @param wallsForPathDecision The list with the wall to be added.
     */
    public void addWallsToCollisionList(List<CollidingGameObject> wallsForPathDecision) {
        collidingGameObjectsForPathDecision.addAll(wallsForPathDecision);
    }

    @Override
    public boolean tryToActivate(XWing xWing) {
        return (xWing.getPosition().getY() - this.getPosition().getY()) < 720;
    }
}


