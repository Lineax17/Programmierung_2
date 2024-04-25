package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;

/**
 * This element represents a shot which is fired by the main object.
 */
public class ShotBlockImages extends GameObject {
    private static final String SHOT = """
            WW
            WW
            WW
            """;
    private ShotMovementPattern shotMovementPattern;

    /**
     * Initializes a new XWing.
     *
     * @param gameView Instance of {@link GameView}.
     * @see GameView
     */
    public ShotBlockImages(GameView gameView) {
        super(gameView, gamePlayManager);
        this.shotMovementPattern = new ShotMovementPattern(this);
        super.size = 2;
        position.updateCoordinates(shotMovementPattern.startPosition());
        super.rotation = 0;
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 2;
    }

    @Override
    public String toString() {
        return "Shot: " + position;
    }

    @Override
    public void updatePosition() {
        position.moveToPosition(shotMovementPattern.nextTargetPosition(), speedInPixel);

        if (position.getY() < 0) {
            position.updateCoordinates(shotMovementPattern.startPosition());
        }
    }

    @Override
    public void addToCanvas() {
        gameView.addBlockImageToCanvas(SHOT, position.getX(), position.getY(), size, rotation);
    }
}