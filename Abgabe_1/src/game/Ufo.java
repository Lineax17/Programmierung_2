package game;

import java.awt.*;

public class Ufo {
    GameView gameView;
    Position position;
    double speedInPixel;
    double rotation;
    double size;
    double width;
    double height;

    Ufo(GameView gameView) {
        this.gameView = gameView;
        size = 30;
        position = new Position(0, GameView.HEIGHT / 2);
        rotation = 0;
        width = 150;
        height = 33;
    }

    @Override
    public String toString() {
        return "UFO: " + position;
    }

    public void updatePosition() {
        position.right();
        rotation = rotation + 1;
    }

    public void addToCanvas() {
        gameView.addTextToCanvas("Objekt 1",
                position.getX(), position.getY(),
                size, true, Color.YELLOW, rotation);
    }
}
