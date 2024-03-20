package game;

import java.awt.*;

public class GameViewManager extends GameView{
    Ufo ufo;

    @Override
    public void initialize() {
        ufo = new Ufo(this);
    }

    @Override
    public void gameLoop() {
        ufo.updatePosition();
        ufo.addToCanvas();
    }
}
