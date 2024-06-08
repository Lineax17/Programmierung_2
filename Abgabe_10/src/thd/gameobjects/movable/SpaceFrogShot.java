package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.ShiftableGameObject;
import thd.gameobjects.unmovable.Wall;

class SpaceFrogShot extends CollidingGameObject implements ShiftableGameObject {

    private final SpaceFrog spaceFrog;

    /**
     * Initializes a new Shot.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @param spaceFrog       Instance of {@link SpaceFrog}.
     * @see GameView
     * @see GamePlayManager
     * @see SpaceFrog
     */
    SpaceFrogShot(GameView gameView, GamePlayManager gamePlayManager, SpaceFrog spaceFrog) {
        super(gameView, gamePlayManager);
        this.spaceFrog = spaceFrog;
        super.size = 2;
        position.updateCoordinates(spaceFrog.getPosition().getX() + 8, spaceFrog.getPosition().getY() + 12);
        super.rotation = 0;
        super.width = 10;
        super.height = 10;
        super.speedInPixel = 2;
        distanceToBackground = 50;
        hitBoxOffsets(0, 0, 0, 0);
    }


    @Override
    public String toString() {
        return "SpaceFrogShot: " + position;
    }

    @Override
    public void updatePosition() {
        position.down();

        if (position.getY() > 720) {
            gamePlayManager.destroyGameObject(this);
        }
    }

    @Override
    public void addToCanvas() {
        gameView.addBlockImageToCanvas(EnemyShotBlockImages.ENEMYSHOT, position.getX(), position.getY(), size, rotation);
    }


    @Override
    public void reactToCollisionWith(CollidingGameObject other) {
        if (other instanceof Wall) {
            gamePlayManager.destroyGameObject(this);
        }
    }
}
