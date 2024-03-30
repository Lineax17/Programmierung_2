package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.movable.Gem;
import thd.gameobjects.movable.Alien;
import thd.gameobjects.unmovable.Score;

public class GameManager {
    Alien alien;
    Gem gem;
    Score obstacle;
    GameView gameView;

    GameManager(GameView gameView) {
        this.gameView = gameView;
        alien = new Alien(gameView);
        gem = new Gem(gameView);
        obstacle = new Score(gameView);
    }

    public void gameLoopUpdate() {
        alien.updatePosition();
        alien.addToCanvas();
        gem.updatePosition();
        gem.addToCanvas();
        obstacle.updatePosition();
        obstacle.addToCanvas();
    }
}
