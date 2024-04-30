package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.GameObject;

/**
 * This element represents a shot which is fired by the main object.
 */
public class ShotBlockImages extends CollidingGameObject {
    private static final String SHOT = """
            WW            WW
            WW            WW
            WW            WW
            """;
    private final XWing xWing;

    /**
     * Initializes a new Shot.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @param xWing           Instance of {@link XWing}.
     * @see GameView
     * @see GamePlayManager
     */
    public ShotBlockImages(GameView gameView, GamePlayManager gamePlayManager, XWing xWing) {
        super(gameView, gamePlayManager);
        this.xWing = xWing;
        super.size = 2;
        position.updateCoordinates(xWing.getPosition());
        super.rotation = 0;
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 7;
        hitBoxOffsets(0, 0, -120, 0);
    }

    @Override
    public String toString() {
        return "Shot: " + position;
    }

    @Override
    public void updatePosition() {
        position.up(speedInPixel);
    }

    @Override
    public void addToCanvas() {
        gameView.addBlockImageToCanvas(SHOT, position.getX(), position.getY(), size, rotation);
    }

    @Override
    public void updateStatus() {
        if (position.getY() < 0) {
            gamePlayManager.destroyGameObject(this);
        }
    }

    @Override
    public void reactToCollisionWith(CollidingGameObject other) {

    }
}