package thd.gameobjects.unmovable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.ActivatableGameObject;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.ShiftableGameObject;
import thd.gameobjects.movable.XWing;
import thd.gameobjects.movable.XWingShot;

/**
 * Describes a game object that gives a boost to main character.
 */
public class Booster extends CollidingGameObject implements ShiftableGameObject, ActivatableGameObject<XWing> {
    private XWing xWing;

    /**
     * Initializes a new booster.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @param xWing           The main charakter.
     * @see GameView
     * @see GamePlayManager
     */
    public Booster(GameView gameView, GamePlayManager gamePlayManager, XWing xWing) {
        super(gameView, gamePlayManager);
        super.width = 64;
        super.height = 64;
        distanceToBackground = 5;
        this.xWing = xWing;
        hitBoxOffsets(0, 0, 0, 0);

    }

    @Override
    public void reactToCollisionWith(CollidingGameObject other) {
        if (other instanceof XWingShot) {
            xWing.applyBoost();
            gamePlayManager.destroyGameObject(this);
        }
    }

    /**
     * Returns a string.
     *
     * @return name of object and position.
     */
    @Override
    public String toString() {
        return "Booster: " + position;
    }

    @Override
    public void updatePosition() {
        if (position.getY() > 720) {
            gamePlayManager.destroyGameObject(this);
        }
    }

    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas("booster.png", position.getX(), position.getY(), 2.0, rotation);
    }

    @Override
    public boolean tryToActivate(XWing xWing) {
        return position.getY() > -100;
    }
}