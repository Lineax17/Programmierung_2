package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;

/**
 * Describes a gameobject looking like a frog.
 */
public class SpaceFrog extends GameObject {
    private StaticRandomMovementPattern spaceFrogMovementPattern;

    /**
     * Initializes a new alien.
     *
     * @param gameView Instance of {@link GameView}.
     * @see GameView
     */
    public SpaceFrog(GameView gameView) {
        super(gameView, gamePlayManager);
        this.spaceFrogMovementPattern = new StaticRandomMovementPattern(this);
        super.size = 30;
        position.updateCoordinates(spaceFrogMovementPattern.startPosition());
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
        return "SpaceFrog: " + position;
    }

    @Override
    public void updatePosition() {
        position.moveToPosition(spaceFrogMovementPattern.nextTargetPosition(), speedInPixel);
        if (position.getY() > 720) {
            position.updateCoordinates(spaceFrogMovementPattern.startPosition());
        }
    }

    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas("space_frog.png", position.getX(), position.getY(), 2.0, rotation);
    }
}
