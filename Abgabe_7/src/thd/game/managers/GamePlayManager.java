package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;

/**
 * Handles dynamically the spawning and destruction of game objects.
 */
public class GamePlayManager extends UserControlledGameObjectPool {
    private final GameObjectManager gameObjectManager;
    protected int points;
    protected int lives;
    private static final int LIVES = 5;

    protected GamePlayManager(GameView gameView) {
        super(gameView);
        gameObjectManager = new GameObjectManager();
        this.lives = LIVES;
        points = 0;
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
     * Decreases the Lives-Counter of the main object by 1 if it's hitting a projectile of wall.
     */
    public void decreaseLive() {
        lives = lives - 1;
    }

    /**
     * Returns the number of point the player achieved.
     *
     * @return the current points.
     */
    public int getPoints() {
        return points;
    }

    /**
     * Spawns a new game object.
     *
     * @param gameObject The game object.
     */
    public void spawnGameObject(GameObject gameObject) {
        gameObjectManager.add(gameObject);
    }

    /**
     * Destroys a certain game object.
     *
     * @param gameObject The game object to be destroyed.
     */
    public void destroyGameObject(GameObject gameObject) {
        gameObjectManager.remove(gameObject);
    }

    protected void destroyAllGameObjects() {
        gameObjectManager.removeAll();
    }

    @Override
    protected void gameLoopUpdate() {
        super.gameLoopUpdate();
        gameObjectManager.gameLoopUpdate();
        gamePlayManagement();
    }

    private void gamePlayManagement() {

    }
}
