package thd.game.managers;

import thd.game.utilities.GameView;
import thd.gameobjects.movable.Alien;
import thd.gameobjects.movable.Ufo;
import thd.gameobjects.unmovable.Score;

public class GameManager {
    Ufo ufo;
    Alien alien;
    Score obstacle;
    GameView gameView;

    GameManager(GameView gameView) {
        this.gameView = gameView;
        ufo = new Ufo(gameView);
        alien = new Alien(gameView);
        obstacle = new Score(gameView);
    }

    public void gameLoopUpdate() {
        ufo.updatePosition();
        ufo.addToCanvas();
        alien.updatePosition();
        alien.addToCanvas();
        obstacle.updatePosition();
        obstacle.addToCanvas();
    }
}
