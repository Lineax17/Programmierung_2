package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.movable.*;
import thd.gameobjects.unmovable.Score;

class GameManager extends UserControlledGameObjectPool{


    GameManager(GameView gameView) {
        super(gameView);
        alien = new Alien(gameView);
        gem = new Gem(gameView);
        score = new Score(gameView);
        xwing = new XWing(gameView);
        spaceFrog = new SpaceFrog(gameView);
        head = new Head(gameView);
        obstacle1 = new Obstacle(gameView);
        turretBig = new TurretBig(gameView);
        turretSmall = new TurretSmall(gameView);
    }

    @Override
    protected void gameLoopUpdate() {
        super.gameLoopUpdate();

        head.updatePosition();
        head.addToCanvas();

        spaceFrog.updatePosition();
        spaceFrog.addToCanvas();

        obstacle1.updatePosition();
        obstacle1.addToCanvas();

        turretBig.updatePosition();
        turretBig.addToCanvas();

        turretSmall.updatePosition();
        turretSmall.addToCanvas();

        gem.updatePosition();
        gem.addToCanvas();

        alien.updatePosition();
        alien.addToCanvas();

        xwing.updateStatus();
        xwing.updatePosition();
        xwing.addToCanvas();

        score.updatePosition();
        score.addToCanvas();
    }
}
