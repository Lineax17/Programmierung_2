package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.movable.Alien;
import thd.gameobjects.movable.Gem;
import thd.gameobjects.movable.RandomBall;
import thd.gameobjects.unmovable.Score;

class GameManager {
    private final Alien alien;
    private final Gem gem;
    private final Score obstacle;
    private final RandomBall randomBall;

    GameManager(GameView gameView) {
        alien = new Alien(gameView);
        gem = new Gem(gameView);
        obstacle = new Score(gameView);
        randomBall = new RandomBall(gameView);
    }

    void gameLoopUpdate() {
        alien.updatePosition();
        alien.addToCanvas();
        gem.updatePosition();
        gem.addToCanvas();
        obstacle.updatePosition();
        obstacle.addToCanvas();
        randomBall.updatePosition();
        randomBall.addToCanvas();
    }
}
