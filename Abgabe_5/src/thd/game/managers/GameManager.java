package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.movable.*;
import thd.gameobjects.unmovable.Score;

class GameManager extends GamePlayManager {

    GameManager(GameView gameView) {
        super(gameView);
        alien = new Alien(gameView, this);
        gem = new Gem(gameView, this);
        score = new Score(gameView, this);
        xwing = new XWing(gameView, this);
        spaceFrog = new SpaceFrog(gameView, this);
        head = new Head(gameView, this);
        obstacle1 = new Obstacle(gameView, this);
        turretBig = new TurretBig(gameView, this);
        turretSmall = new TurretSmall(gameView, this);

        spawnGameObject(alien);
        spawnGameObject(gem);
        spawnGameObject(score);
        spawnGameObject(xwing);
        spawnGameObject(spaceFrog);
        spawnGameObject(head);
        spawnGameObject(obstacle1);
        spawnGameObject(turretBig);
        spawnGameObject(turretSmall);
    }


    @Override
    protected void gameLoopUpdate() {
        super.gameLoopUpdate();
        gameManagement();
    }

    private void gameManagement() {

    }

}
