package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.Position;

import java.awt.*;

public class Gem {
    GameView gameView;
    Position position;
    double speedInPixel;
    double rotation;
    double size;
    double width;
    double height;

    public Gem(GameView gameView) {
        this.gameView = gameView;
        size = 30;
        position = new Position(1100, 650);
        rotation = 0;
        width = 150;
        height = 33;
        speedInPixel = 2;
    }

    @Override
    public String toString() {
        return "Gem: " + position;
    }

    public void updatePosition() {
        position.left(speedInPixel);
    }

    public void addToCanvas() {
        gameView.addImageToCanvas("gem.png", position.getX(), position.getY(), 2.0, rotation);
    }
}
