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
    }

    @Override
    public String toString() {
        return "Alien: " + position;
    }

    public void updatePosition() {
        position.left();
    }

    public void addToCanvas() {
        gameView.addRectangleToCanvas(position.getX(), position.getY(), 160, 37, 0, true, Color.GREEN);
        gameView.addRectangleToCanvas(position.getX(), position.getY(), 160, 37, 5, false, Color.WHITE);
        gameView.addTextToCanvas("Objekt 2",
                position.getX(), position.getY(),
                size, true, Color.BLUE, rotation);

    }
}
