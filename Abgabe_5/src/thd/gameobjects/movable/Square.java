package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;

import java.awt.*;

public class Square extends GameObject {
    public Square(GameView gameView) {
        super(gameView);
        super.width = 30;
        super.height = 30;
        super.position.updateCoordinates(100, 100);
        super.speedInPixel = 5;
    }

    @Override
    public String toString() {
        return "Square: " + position;
    }

    @Override
    public void updatePosition() {
        position.left(5);
    }

    @Override
    public void addToCanvas() {
        gameView.addRectangleToCanvas(position.getX(), position.getY(), width, height, 3, false, Color.RED);
    }
}
