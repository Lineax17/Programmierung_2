package game;

public class GameViewManager extends GameView {
    Ufo ufo;
    Alien alien;
    Score obstacle;

    @Override
    public void initialize() {
        ufo = new Ufo(this);
        alien = new Alien(this);
        obstacle = new Score(this);
    }

    @Override
    public void gameLoop() {
        ufo.updatePosition();
        ufo.addToCanvas();
        alien.updatePosition();
        alien.addToCanvas();
        obstacle.updatePosition();
        obstacle.addToCanvas();
    }
}
