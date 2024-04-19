package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.movable.Alien;
import thd.gameobjects.movable.Gem;
import thd.gameobjects.movable.XWing;
import thd.gameobjects.unmovable.Score;

class GameManager extends UserControlledGameObjectPool{


    GameManager(GameView gameView) {
        super(gameView);
        alien = new Alien(gameView);
        gem = new Gem(gameView);
        obstacle = new Score(gameView);
        xwing = new XWing(gameView);
    }

    @Override
    protected void gameLoopUpdate() {
        super.gameLoopUpdate();
        super.alien.updatePosition();
        super.alien.addToCanvas();
        super.gem.updatePosition();
        super.gem.addToCanvas();
        super.obstacle.updatePosition();
        super.obstacle.addToCanvas();
        super.xwing.updateStatus();
        super.xwing.updatePosition();
        super.xwing.addToCanvas();
    }
}
