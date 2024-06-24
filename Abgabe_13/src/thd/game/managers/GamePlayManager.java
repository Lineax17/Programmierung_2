package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;

/**
 * Handles dynamically the spawning and destruction of game objects.
 */
public class GamePlayManager extends WorldShiftManager {
    private final GameObjectManager gameObjectManager;
    protected int points;
    protected int lives;
    private int speedInPixel;

    protected GamePlayManager(GameView gameView) {
        super(gameView);
        gameObjectManager = new GameObjectManager();
        speedInPixel = 3;
    }

    /**
     * Adds points to the {@link thd.gameobjects.unmovable.Score}.
     *
     * @param newPoints the new points to be added.
     */
    public void addPoints(int newPoints) {
        points = points + newPoints;
    }

    /**
     * Decreases the Lives-Counter of the main object by 1 if it's hitting a projectile or wall.
     */
    public void decreaseLive() {
        lives--;
    }

    /**
     * Returns the number of point the player achieved.
     *
     * @return the current points.
     */
    public int getPoints() {
        return points;
    }

    @Override
    public void spawnGameObject(GameObject gameObject) {
        super.spawnGameObject(gameObject);
        gameObjectManager.add(gameObject);
    }

    @Override
    public void destroyGameObject(GameObject gameObject) {
        super.destroyGameObject(gameObject);
        gameObjectManager.remove(gameObject);
    }

    @Override
    protected void destroyAllGameObjects() {
        super.destroyAllGameObjects();
        gameObjectManager.removeAll();
    }

    @Override
    protected void gameLoopUpdate() {
        super.gameLoopUpdate();
        gameObjectManager.gameLoopUpdate();
        gamePlayManagement();
    }

    private void gamePlayManagement() {
        moveWorldDown(speedInPixel);
    }

    /**
     * Returns the current lives.
     *
     * @return The lives.
     */
    public int getLives() {
        return lives;
    }
}
