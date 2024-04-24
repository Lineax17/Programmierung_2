package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;
import thd.gameobjects.movable.Square;

public class GamePlayManager extends UserControlledGameObjectPool{
    GameObjectManager gameObjectManager;

    public GamePlayManager(GameView gameView) {
        super(gameView);
        gameObjectManager = new GameObjectManager();
    }

    public void spawnGameObject(GameObject gameObject) {

    }

    public void destroyGameObject(GameObject gameObject) {

    }

    protected void destroyAllGameObjects() {

    }

    @Override
    protected void gameLoopUpdate() {
        super.gameLoopUpdate();
        gameObjectManager.gameLoopUpdate();
        gamePlayManagement();
    }

    private void gamePlayManagement() {
        spawnGameObject(new Square(gameView));
    }
}
