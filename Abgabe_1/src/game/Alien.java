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

    public Alien(GameView gameView) {
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
        return "Alien: " + position;
    }

    public void updatePosition() {
        position.left(speedInPixel);
    }

    public void addToCanvas() {
        gameView.addRectangleToCanvas(position.getX(), position.getY(), 150, 38, 0, true, Color.GREEN);
        gameView.addRectangleToCanvas(position.getX(), position.getY(), 150, 38, 5, false, Color.WHITE);
        gameView.addTextToCanvas("Objekt 2",
                position.getX() + 4, position.getY(),
                size, true, Color.BLUE, rotation);

    }
}
