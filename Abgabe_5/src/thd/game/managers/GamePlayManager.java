package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;
import thd.gameobjects.movable.Square;

public class GamePlayManager extends UserControlledGameObjectPool{
    GameObjectManager gameObjectManager;
    int currentNumberOfVisibleSquares;

    public GamePlayManager(GameView gameView) {
        super(gameView);
        gameObjectManager = new GameObjectManager();
        currentNumberOfVisibleSquares = 0;
    }

    public void spawnGameObject(GameObject gameObject) {
        gameObjectManager.add(gameObject);
    }

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
        if (currentNumberOfVisibleSquares < 5){
            if (gameView.timer(1000, this)) {
                spawnGameObject(new Square(gameView));
                currentNumberOfVisibleSquares++;
            }
        }
    }
}
