package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.MainCharacter;
import thd.gameobjects.unmovable.Wall;

import java.awt.*;
import java.util.List;

/**
 * Describing the main game object, which is controlled by the player.
 * The force is strong in this one.
 */
public class XWing extends CollidingGameObject implements MainCharacter {

    private int shotDurationInMilliseconds;
    private State currentState;
    private final StandardState standardState;
    private ExplodingState explodingState;
    private BlinkingState blinkingState;
    private String imageName;
    private boolean boostIsApplied;
    private final List<CollidingGameObject> collidingGameObjectsForPathDecision;
    private boolean alreadyShot;


    private enum State {
        STANDARD, EXPLODING, BLINKING
    }

    /**
     * Initializes a new XWing.
     * ""The Force is strong with this one"".
     *
     * @param gameView                            Instance of {@link GameView}.
     * @param gamePlayManager                     Instance of {@link GamePlayManager}.
     * @param collidingGameObjectsForPathDecision Objects needed for path decision.
     * @see GameView
     * @see GamePlayManager
     */
    public XWing(GameView gameView, GamePlayManager gamePlayManager, List<CollidingGameObject> collidingGameObjectsForPathDecision) {
        super(gameView, gamePlayManager);
        size = 2;
        position.updateCoordinates((double) GameView.WIDTH / 2, 600);
        rotation = 0;
        width = 150;
        height = 33;
        speedInPixel = 4;
        shotDurationInMilliseconds = 300;
        distanceToBackground = 50;
        boostIsApplied = false;
        this.collidingGameObjectsForPathDecision = collidingGameObjectsForPathDecision;
        currentState = State.STANDARD;
        standardState = StandardState.STANDARD_1;
        explodingState = ExplodingState.EXPLODING_1;
        blinkingState = BlinkingState.BLINKING_1;
        alreadyShot = false;
        hitBoxOffsets(0, 0, -120, 0);
    }

    private enum StandardState {
        STANDARD_1("xwing.png");

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

    private enum BlinkingState {
        BLINKING_1("xwing.png"),
        BLINKING_2("xwing_blinking.png");

        private final String display;

        BlinkingState(String display) {
            this.display = display;
        }

    }

    @Override
    public void reactToCollisionWith(CollidingGameObject other) {
        if (currentState == State.STANDARD) {
            if (other instanceof Wall || other instanceof AlienShot || other instanceof ShotDownwards || other instanceof ShotUpwards || other instanceof ShotRightwards || other instanceof ShotLeftwards) {
                switchToExplosion();
                gamePlayManager.decreaseLive();
            }

            if (other instanceof Gem || other instanceof Ufo || other instanceof Alien || other instanceof SuperAlien || other instanceof SpaceFrog || other instanceof SuperFrog || other instanceof Worm || other instanceof SuperWorm) {
                switchToExplosion();
                gamePlayManager.decreaseLive();
            }
        }
    }


    @Override
    public void updateStatus() {
        switch (currentState) {
            case STANDARD -> {
                imageName = standardState.display;
            }
            case EXPLODING -> {
                imageName = explodingState.display;
                if (gameView.timer(80, this)) {
                    switchToNextExplosionState();
                }
                if (gameView.timer(320, this)) {
                    switchToBlinking();
                }
            }
            case BLINKING -> {
                imageName = blinkingState.display;
                if (gameView.timer(150, this)) {
                    switchToNextBlinkingState();
                }
                if (gameView.timer(900, this)) {
                    switchToStandard();
                }
            }
        }
        //System.out.println(currentState);

        if (boostIsApplied) {
            if (gameView.timer(5000, this)) {
                takeAwayBoost();
            }
        }

    }

    private void switchToExplosion() {
        currentState = State.EXPLODING;
        gameView.playSound("explosion.wav", false);
    }

    private void switchToStandard() {
        currentState = State.STANDARD;
    }

    private void switchToNextExplosionState() {
        int nextState = (explodingState.ordinal() + 1);
        if (nextState < ExplodingState.values().length) {
            explodingState = ExplodingState.values()[nextState];
        }
    }

    private void switchToBlinking() {
        currentState = State.BLINKING;
    }

    private void switchToNextBlinkingState() {
        int nextState = (blinkingState.ordinal() + 1) % BlinkingState.values().length;
        if (nextState < BlinkingState.values().length) {
            blinkingState = BlinkingState.values()[nextState];
        }
    }

    /**
     * Returns a string.
     *
     * @return name of object and position.
     */
    @Override
    public String toString() {
        return "XWing: " + position;
    }


    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas(imageName, position.getX(), position.getY(), size, rotation);
        gameView.addTextToCanvas("state: " + currentState, position.getX(), position.getY(), 10, false, Color.WHITE, 0);
    }

    /**
     * Allows the main object to move right.
     */
    public void right() {
        position.right(speedInPixel);
    }

    /**
     * Allows the main object to move left.
     */
    public void left() {
        position.left(speedInPixel);
    }

    /**
     * Allows the main object to move down.
     */
    public void down() {
        position.down(speedInPixel);
    }

    /**
     * Allows the main object to move up.
     */
    public void up() {
        position.up(speedInPixel);
    }

    @Override
    public void shoot() {
        if (!alreadyShot || gameView.timer(shotDurationInMilliseconds, this)) {
            alreadyShot = true;
            gamePlayManager.spawnGameObject(new XWingShot(gameView, gamePlayManager, this));
            gameView.playSound("shot.wav", false);
        }
    }

    /**
     * Applies temporary boost to xwing.
     */
    public void applyBoost() {
        boostIsApplied = true;
        shotDurationInMilliseconds = 150;
    }

    private void takeAwayBoost() {
        boostIsApplied = false;
        shotDurationInMilliseconds = 300;
    }
}
