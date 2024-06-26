package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;
import thd.gameobjects.movable.Square;

/**
 * Handles dynamically the spawning and destruction of gameobjects.
 */
public class GamePlayManager extends UserControlledGameObjectPool {
    private final GameObjectManager gameObjectManager;
    private int currentNumberOfVisibleSquares;

    protected GamePlayManager(GameView gameView) {
        super(gameView);
        gameObjectManager = new GameObjectManager();
        currentNumberOfVisibleSquares = 0;
    }

    /**
     * Spawns a new gameobject.
     *
     * @param gameObject The gameobject.
     */
    public void spawnGameObject(GameObject gameObject) {
        gameObjectManager.add(gameObject);
    }

    /**
     * Destroys a certain gameobject.
     *
     * @param gameObject The gameobject to be destroyed.
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
        if (currentNumberOfVisibleSquares < 5) {
            if (gameView.timer(1000, this)) {
                spawnGameObject(new Square(gameView, this));
                currentNumberOfVisibleSquares++;
            }
        }
    }
}
