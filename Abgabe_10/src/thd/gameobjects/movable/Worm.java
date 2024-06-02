package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.ActivatableGameObject;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.ShiftableGameObject;

public class Worm extends CollidingGameObject implements ShiftableGameObject, ActivatableGameObject<XWing> {
    private final WormMovementPattern wormMovementPattern;
    private boolean stop;

    private enum State {
        STANDARD, EXPLODING
    }

    private State currentState;
    private StandardState standardState;
    private ExplodingState explodingState;
    private String imageName;

    /**
     * Initializes a new alien.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public Worm(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
        this.wormMovementPattern = new WormMovementPattern(this);
        stop = false;
        super.size = 30;
        super.rotation = 0;
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 2;
        distanceToBackground = 10;
        currentState = State.STANDARD;
        standardState = StandardState.STANDARD_1;
        explodingState = ExplodingState.EXPLODING_1;
        hitBoxOffsets(0, 0, -120, 0);
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
        return "Ufo: " + position;
    }

    @Override
    public void updatePosition() {
        if (!stop) {
            position.moveToPosition(wormMovementPattern.nextTargetPosition(), speedInPixel);
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
        STANDARD_1("worm_1.png");

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
        return (xWing.getPosition().getY() - this.getPosition().getY()) < 720;
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

