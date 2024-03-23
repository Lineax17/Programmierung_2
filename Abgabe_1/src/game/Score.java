package game;

import java.awt.*;

public class Score {
    GameView gameView;
    Position position;
    double speedInPixel;
    double rotation;
    double size;
    double width;
    double height;

    public Score(GameView gameView) {
        this.gameView = gameView;
        width = 150;
        height = 33;
        size = 30;
        position = new Position(GameView.WIDTH - width, -8);
        rotation = 0;

    }

    @Override
    public String toString() {
        return "Obstacle: " + position;
    }

    public void updatePosition() {

    }

    public void addToCanvas() {
        gameView.addTextToCanvas("Objekt 3",
                position.getX(), position.getY(),
                size, true, Color.YELLOW, rotation);
    }
}
