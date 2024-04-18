package thd.game.managers;

import thd.game.utilities.GameView;

class GameManager extends UserControlledGameObjectPool{


    GameManager(GameView gameView) {
        super(gameView);
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
        super.xwing.updatePosition();
        super.xwing.addToCanvas();
    }
}
