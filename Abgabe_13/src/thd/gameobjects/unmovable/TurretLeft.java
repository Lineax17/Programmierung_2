package thd.gameobjects.unmovable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.ActivatableGameObject;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.ShiftableGameObject;
import thd.gameobjects.movable.ShotRightwards;
import thd.gameobjects.movable.XWingShot;
import thd.gameobjects.movable.XWing;

import java.util.Random;

/**
 * Describing a static gameobject that looks like a turret.
 */
public class TurretLeft extends CollidingGameObject implements ShiftableGameObject, ActivatableGameObject<XWing> {
    private String[] namesOfAssets;
    private Random random;
    private String imageName;
    private int randomIndex;


    /**
     * Initializes a new small turret.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public TurretLeft(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
        random = new Random();
        super.size = 30;
        super.rotation = 0;
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 2;
        distanceToBackground = 5;
        namesOfAssets = new String[]{"turret_left_big.png", "turret_left_dual.png", "turret_left_single.png", "turret_left_small.png", "turret_left_weird.png"};
        randomIndex = random.nextInt(namesOfAssets.length);
        imageName = namesOfAssets[randomIndex];
        hitBoxOffsets(0, 0, -120, 0);

    }

    @Override
    public void reactToCollisionWith(CollidingGameObject other) {
        if (other instanceof XWingShot) {
            gamePlayManager.destroyGameObject(this);
        }
    }

    @Override
    public String toString() {
        return "TurretLeft: " + position;
    }

    @Override
    public void updatePosition() {
        if (position.getY() > 720) {
            gamePlayManager.destroyGameObject(this);
        }
    }

    @Override
    public void updateStatus() {
        shoot();
    }

    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas(imageName, position.getX(), position.getY(), 2.0, rotation);
    }

    private void shoot() {
        if (gameView.timer(3000, this)) {
            gamePlayManager.spawnGameObject(new ShotRightwards(gameView, gamePlayManager, this));
        }
    }

    @Override
    public boolean tryToActivate(XWing xWing) {
        return position.getY() > - 100;
    }
}
