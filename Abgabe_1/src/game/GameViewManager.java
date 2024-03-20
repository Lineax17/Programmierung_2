package game;

import java.awt.*;

public class GameViewManager extends GameView{
    @Override
    public void initialize() {
    }

    @Override
    public void gameLoop() {
        addTextToCanvas("HALLO", 600, 300, 30, true, Color.WHITE, 0);
    }
}
