package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.ActivatableGameObject;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.ShiftableGameObject;

import java.util.List;

/**
 * Describes a game object looking like a worm.
 */
public class SuperWorm extends CollidingGameObject implements ShiftableGameObject, ActivatableGameObject<XWing> {
    private boolean stop;
    private final List<CollidingGameObject> collidingGameObjectsForPathDecision;


    private enum State {
        STANDARD, EXPLODING
    }

    private State currentState;
    private StandardState standardState;
    private ExplodingState explodingState;
    private String imageName;
    private boolean movementIsDownwards;

    /**
     * Initializes a new alien.
     *
     * @param gameView                            Instance of {@link GameView}.
     * @param gamePlayManager                     Instance of {@link GamePlayManager}.
     * @param collidingGameObjectsForPathDecision The list needed for collision detection.
     * @see GameView
     * @see GamePlayManager
     */
    public SuperWorm(GameView gameView, GamePlayManager gamePlayManager, List<CollidingGameObject> collidingGameObjectsForPathDecision) {
        super(gameView, gamePlayManager);
        this.collidingGameObjectsForPathDecision = collidingGameObjectsForPathDecision;
        stop = false;
        super.size = 30;
        super.rotation = 0;
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 2;
        distanceToBackground = 10;
        movementIsDownwards = false;
        currentState = State.STANDARD;
        standardState = StandardState.STANDARD_1;
        explodingState = ExplodingState.EXPLODING_1;
        hitBoxOffsets(0, 0, -120, 0);
    }

    @Override
    public void reactToCollisionWith(CollidingGameObject other) {
        if (currentState == State.STANDARD) {

            if (other instanceof XWingShot || other instanceof XWing) {
                switchToExplosion();
            }
        }
    }

    /**
     * Returns a string.
     *
     * @return name of object and position.
     */
    @Override
    public String toString() {
        return "Ufo: " + position;
    }

    @Override
    public void updatePosition() {
        if (!movementIsDownwards) {
            sidewardsShift();
        } else {
            sidewardsShift();
            position.down(speedInPixel);
        }


        if (gameView.timer(3000, this)) {
            movementIsDownwards = true;
        }
        if (gameView.timer(2000, this)) {
            movementIsDownwards = false;
        }

        for (int i = 0; i < collidingGameObjectsForPathDecision.size(); i++) {
            if (collidesWith(collidingGameObjectsForPathDecision.get(i))) {
                if (position.getX() < 640) {
                    position.right(33);
                    break;
                } else {
                    position.left(33);
                    break;
                }

            }
        }


        if (position.getY() > 720) {
            gamePlayManager.destroyGameObject(this);
        }
    }

    private void sidewardsShift() {
        if (position.getX() > 640) {
            if (!stop) {
                position.left(speedInPixel);
                if (gameView.timer(1500, this)) {
                    stop = true;
                }
            } else {
                position.right(speedInPixel);
                if (gameView.timer(1500, this)) {
                    stop = false;
                }
            }
        } else {
            if (!stop) {
                position.right(speedInPixel);
                if (gameView.timer(1000, this)) {
                    stop = true;
                }
            } else {
                position.left(speedInPixel);
                if (gameView.timer(1000, this)) {
                    stop = false;
                }
            }
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
        STANDARD_1("super_worm_1.png"),
        STANDARD_2("super_worm_2.png"),
        STANDARD_3("super_worm_3.png"),
        STANDARD_4("super_worm_4.png"),
        STANDARD_5("super_worm_3.png"),
        STANDARD_6("super_worm_2.png");

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

    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas(imageName, position.getX(), position.getY(), 2.0, rotation);
    }

    @Override
    public boolean tryToActivate(XWing xWing) {
        return position.getY() > -100;
    }

    private void shoot() {
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
            gamePlayManager.addPoints(10);
        }
    }
}
