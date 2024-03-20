package game;

import java.awt.*;

public class Alien {
    GameView gameView;
    Position position;
    double speedInPixel;
    double rotation;
    double size;
    double width;
    double height;

    Alien(GameView gameView) {
        this.gameView = gameView;
        size = 30;
        position = new Position(1100, 650);
        rotation = 0;
        width = 150;
        height = 33;
    }

    @Override
    public String toString() {
        return "UFO: " + position;
    }

    public void updatePosition() {
        position.left();
    }

    public void addToCanvas() {
        gameView.addTextToCanvas("Objekt 2",
                position.getX(), position.getY(),
                size, true, Color.BLUE, rotation);
    }
}
