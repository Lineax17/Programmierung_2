package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.ActivatableGameObject;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.ShiftableGameObject;

/**
 * Describes a gameobject looking like a frog.
 */
public class SpaceFrog extends CollidingGameObject implements ShiftableGameObject, ActivatableGameObject<XWing> {
    private enum State {
        STANDARD, EXPLODING
    }

    private State currentState;
    private StandardState standardState;
    private ExplodingState explodingState;
    private String imageName;

    /**
     * Initializes a new spacefrog.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public SpaceFrog(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
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
        return "SpaceFrog: " + position;
    }

    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas(imageName, position.getX(), position.getY(), 2.0, rotation);
    }

    @Override
    public boolean tryToActivate(XWing xWing) {
        return (xWing.getPosition().getY() - this.getPosition().getY()) < 720;
    }

    private enum StandardState {
        STANDARD_1("space_frog_1.png"),
        STANDARD_2("space_frog_2.png"),
        STANDARD_3("space_frog_3.png"),
        STANDARD_4("space_frog_2.png"),
        STANDARD_5("space_frog_1.png");

        private final String display;

        StandardState(String display) {
            this.display = display;
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

    @Override
    public void updateStatus() {
        super.updateStatus();
        switch (currentState) {
            case STANDARD -> {
                imageName = standardState.display;

                if (gameView.timer(300, this)) {
                    switchToNextStandardState();
                    if (standardState == StandardState.STANDARD_3) {
                        shoot();
                    }
                }
            }
            case EXPLODING -> {
                imageName = explodingState.display;
                if (gameView.timer(80, this)) {
                    switchToNextExplosionState();
                }
            }
        }

        if (position.getY() > 720) {
            gamePlayManager.destroyGameObject(this);
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
            gamePlayManager.addPoints(10);
        }
    }

    private void shoot() {
        gamePlayManager.spawnGameObject(new SpaceFrogShot(gameView, gamePlayManager, this));
    }
}
