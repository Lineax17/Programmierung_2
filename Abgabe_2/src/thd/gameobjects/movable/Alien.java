package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.Position;

public class Alien {
    GameView gameView;
    Position position;
    double speedInPixel;
    double rotation;
    double size;
    double width;
    double height;

    public Alien(GameView gameView) {
        this.gameView = gameView;
        size = 30;
        position = new Position(0, GameView.HEIGHT / 2);
        rotation = 0;
        width = 150;
        height = 33;
        speedInPixel = 5;
    }

    @Override
    public String toString() {
        return "Alien: " + position;
    }

    public void updatePosition() {
        position.right(speedInPixel);
        rotation = rotation + 1;
    }

    public void addToCanvas() {
        gameView.addImageToCanvas("alien.png", position.getX(), position.getY(), 2.0, rotation);
    }
}
