package thd.gameobjects.unmovable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.ShiftableGameObject;

/**
 * This class represents the left border of the game world.
 */
public class Wall extends CollidingGameObject implements ShiftableGameObject {
    int[][] walls;
    int line;
    int column;

    /**
     * Initializes a new wall.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public Wall(GameView gameView, GamePlayManager gamePlayManager, int[][] walls, int line, int column) {
        super(gameView, gamePlayManager);
        this.walls = walls;
        this.line = line;
        this.column = column;
        super.width = 32;
        super.height = 32;
        hitBoxOffsets(0, 0, 0, 0);
    }

    @Override
    public void reactToCollisionWith(CollidingGameObject other) {

    }

    @Override
    public String toString() {
        return "Wall: " + position;
    }

    @Override
    public void updatePosition() {
        if (position.getY() > 720) {
            gamePlayManager.destroyGameObject(this);
        }
    }

    @Override
    public void addToCanvas() {
        boolean isInner = walls[line][column - 1] == 1 && walls[line + 1][column] == 1 && walls[line][column + 1] == 1 && walls[line - 1][column] == 1;
        boolean isRight = walls[line + 1][column] == 1 && walls[line][column + 1] == 1 && walls[line - 1][column] == 1;
        boolean isLeft = walls[line][column - 1] == 1 && walls[line + 1][column] == 1 && walls[line - 1][column] == 1;
        boolean isRightUpperCorner = walls[line + 1][column] == 1 && walls[line][column + 1] == 1;
        boolean isRightLowerCorner = walls[line - 1][column] == 1 && walls[line][column + 1] == 1;
        boolean isLeftUpperCorner = walls[line][column - 1] == 1 && walls[line + 1][column] == 1;
        boolean isLeftLowerCorner = walls[line][column - 1] == 1 && walls[line - 1][column] == 1;


        if (isInner) {
            gameView.addImageToCanvas("wall_inner.png", position.getX(), position.getY(), 1, rotation);
        } else if (isRight) {
            gameView.addImageToCanvas("wall_right.png", position.getX(), position.getY(), 1, rotation);
        } else if (isLeft) {
            gameView.addImageToCanvas("wall_left.png", position.getX(), position.getY(), 1, rotation);
        } else if (isRightUpperCorner) {
            gameView.addImageToCanvas("corner_right_top_1.png", position.getX(), position.getY(), 1, rotation);
        } else if (isRightLowerCorner) {
            gameView.addImageToCanvas("corner_right_bottom_1.png", position.getX(), position.getY(), 1, rotation);
        } else if (isLeftUpperCorner) {
            gameView.addImageToCanvas("corner_left_top_1.png", position.getX(), position.getY(), 1, rotation);
        } else if (isLeftLowerCorner) {
            gameView.addImageToCanvas("corner_left_bottom_1.png", position.getX(), position.getY(), 1, rotation);
        }
    }
}
