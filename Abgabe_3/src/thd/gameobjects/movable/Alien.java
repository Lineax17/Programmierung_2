package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;
/**
 * Describing a moving enemy that looks like an alien.
 */
public class Alien extends GameObject {
    private final AlienMovementPattern alienMovementPattern;
    private boolean stop;

    /**
     * Initializes a new alien.
     *
     * @param gameView Instance of {@link GameView}.
     * @see GameView
     */
    public Alien(GameView gameView) {
        super(gameView);
        this.alienMovementPattern = new AlienMovementPattern(this);
        stop = false;
        super.size = 30;
        position.updateCoordinates(alienMovementPattern.startPosition());
        super.rotation = 0;
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 2;
    }

    /**
     * Returns a string.
     *
     * @return name of object and position.
     */
    @Override
    public String toString() {
        return "Alien: " + position;
    }

    @Override
    public void updatePosition() {
        if (stop) {
            if (gameView.timer(500, this)) {
                stop = false;
            }
        } else {
            if (gameView.timer(8000, this)) {
                stop = true;
            }
            position.moveToPosition(alienMovementPattern.nextTargetPosition(), speedInPixel);
        }

        if (position.getY() > 720) {
            position.updateCoordinates(alienMovementPattern.startPosition());
        }
    }

    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas("alien.png", position.getX(), position.getY(), 2.0, rotation);
    }
}
