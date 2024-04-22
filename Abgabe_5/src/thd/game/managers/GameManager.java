package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.movable.*;
import thd.gameobjects.unmovable.Score;

class GameManager extends UserControlledGameObjectPool{
    private final GameObjectManager gameObjectManager;


    GameManager(GameView gameView) {
        super(gameView);
        this.gameObjectManager = new GameObjectManager();

        alien = new Alien(gameView);
        gem = new Gem(gameView);
        score = new Score(gameView);
        xwing = new XWing(gameView);
        spaceFrog = new SpaceFrog(gameView);
        head = new Head(gameView);
        obstacle1 = new Obstacle(gameView);
        turretBig = new TurretBig(gameView);
        turretSmall = new TurretSmall(gameView);
        shotBlockImages = new ShotBlockImages(gameView);

        gameObjectManager.add(alien);
        gameObjectManager.add(gem);
        gameObjectManager.add(score);
        gameObjectManager.add(xwing);
        gameObjectManager.add(spaceFrog);
        gameObjectManager.add(head);
        gameObjectManager.add(obstacle1);
        gameObjectManager.add(turretBig);
        gameObjectManager.add(turretSmall);
        gameObjectManager.add(shotBlockImages);
    }


    @Override
    protected void gameLoopUpdate() {
        super.gameLoopUpdate();
        gameObjectManager.gameLoopUpdate();
    }
}
