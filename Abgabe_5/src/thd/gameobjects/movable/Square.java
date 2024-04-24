package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;

import java.awt.*;

public class Square extends GameObject {
    GameView gameView;

    public Square(GameView gameView) {
        super(gameView);
        super.width = 30;
        super.height = 30;
        super.position.updateCoordinates(100, 100);

    }

    @Override
    public String toString() {
        return "XWing: " + position;
    }

    @Override
    public void updatePosition() {

    }

    @Override
    public void addToCanvas() {
        gameView.addRectangleToCanvas(position.getX(), position.getY(), width, height, 3, false, Color.RED);
    }
}
