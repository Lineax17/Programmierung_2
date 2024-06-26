package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.MainCharacter;
import thd.gameobjects.unmovable.Wall;

/**
 * Describing the main game object, which is controlled by the player.
 * The force is strong in this one.
 */
public class XWing extends CollidingGameObject implements MainCharacter {

    private final int shotDurationInMilliseconds;
    private State currentState;
    private StandardState standardState;
    private ExplodingState explodingState;
    private BlinkingState blinkingState;
    private String imageName;

    private enum State {
        STANDARD, EXPLODING, BLINKING
    }

    /**
     * Initializes a new XWing.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public XWing(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
        size = 2;
        position.updateCoordinates(GameView.WIDTH / 2, 600);
        rotation = 0;
        width = 150;
        height = 33;
        speedInPixel = 4;
        shotDurationInMilliseconds = 300;
        distanceToBackground = 50;
        currentState = State.STANDARD;
        standardState = StandardState.STANDARD_1;
        explodingState = ExplodingState.EXPLODING_1;
        blinkingState = BlinkingState.BLinking_1;
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
        BLinking_1("xwing.png"),
        BLINKING_2("xwing_blinking.png"),
        BLINKING_3("xwing.png"),
        BLINKING_4("xwing_blinking.png"),
        BLINKING_5("xwing.png"),
        BLINKING_6("xwing_blinking.png"),
        BLINKING_7("xwing.png");

        private final String display;

        BlinkingState(String display) {
            this.display = display;
        }

    }

    @Override
    public void reactToCollisionWith(CollidingGameObject other) {
        if (other instanceof Wall || other instanceof AlienShot || other instanceof GeneralEnemyShot) {
            switchToExplosion();
            gamePlayManager.decreaseLive();
            position.updateCoordinates((double) GameView.WIDTH / 2, 600);
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
            }
            case BLINKING -> {
                imageName = blinkingState.display;
                if (gameView.timer(150, this)) {
                    switchToNextBlinkingState();
                }
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
        } else {
            switchToBlinking();
        }
    }

    private void switchToBlinking() {
        currentState = State.BLINKING;
    }

    private void switchToNextBlinkingState() {
        int nextState = (blinkingState.ordinal() + 1);
        if (nextState < BlinkingState.values().length) {
            blinkingState = BlinkingState.values()[nextState];
        } else {
            switchToStandard();
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
        if (gameView.timer(shotDurationInMilliseconds, this)) {
            gamePlayManager.spawnGameObject(new XWingShot(gameView, gamePlayManager, this));
            gameView.playSound("shot.wav", false);
        }
    }
}
