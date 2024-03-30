package thd.gameobjects.unmovable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.Position;

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
        position = new Position(GameView.WIDTH / 2, -8);
        rotation = 0;

    }

    @Override
    public String toString() {
        return "Score: " + position;
    }

    public void updatePosition() {

    }

    public void addToCanvas() {
        gameView.addTextToCanvas("000000",
                position.getX(), position.getY(),
                size, true, Color.WHITE, rotation);
    }
}
