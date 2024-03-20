package game;

import java.awt.*;

public class GameViewManager extends GameView{
    Ufo ufo;
    Alien alien;

    @Override
    public void initialize() {
        ufo = new Ufo(this);
        alien = new Alien(this);
    }

    @Override
    public void gameLoop() {
        ufo.updatePosition();
        ufo.addToCanvas();
        alien.updatePosition();
        alien.addToCanvas();
    }
}
