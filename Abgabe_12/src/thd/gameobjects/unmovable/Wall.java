package thd.gameobjects.unmovable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.ActivatableGameObject;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.ShiftableGameObject;
import thd.gameobjects.movable.XWing;

import java.util.Random;

/**
 * This class represents the left border of the game world.
 */
public class Wall extends CollidingGameObject implements ShiftableGameObject, ActivatableGameObject<XWing> {
    private final int[][] walls;
    private final int line;
    private final int column;
    private Random random;
    private String formattedImageName;

    /**
     * Initializes a new wall.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @param walls           Array representation of every wall.
     * @param line            Line in the array.
     * @param column          Column in the array.
     * @see GameView
     * @see GamePlayManager
     */
    public Wall(GameView gameView, GamePlayManager gamePlayManager, int[][] walls, int line, int column) {
        super(gameView, gamePlayManager);
        random = new Random();
        this.walls = walls;
        this.line = line;
        this.column = column;
        super.width = 32;
        super.height = 32;
        hitBoxOffsets(0, 0, 0, 0);
        formattedImageName = chooseWallAsset();
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
        gameView.addImageToCanvas(formattedImageName, position.getX(), position.getY(), 1, rotation);

    }

    private String chooseWallAsset() {
        String imageName = "";

        if (line == 0 || line == walls.length - 1) {
            if (column <= 20) {
                if (walls[line][column + 1] == 0) {
                    imageName = "wall_left.png";
                } else {
                    imageName = "wall_inner.png";
                }
            } else {
                if (walls[line][column - 1] == 0) {
                    imageName = "wall_right.png";
                } else {
                    imageName = "wall_inner.png";
                }
            }
        } else if (column == 0 || column == walls[line].length - 1) {
            imageName = "wall_inner.png";
        } else {
            boolean isInner = walls[line][column - 1] == 1 && walls[line + 1][column] == 1 && walls[line][column + 1] == 1 && walls[line - 1][column] == 1;
            boolean isRight = walls[line + 1][column] == 1 && walls[line][column + 1] == 1 && walls[line - 1][column] == 1;
            boolean isLeft = walls[line][column - 1] == 1 && walls[line + 1][column] == 1 && walls[line - 1][column] == 1;
            boolean isRightUpperCorner = walls[line + 1][column] == 1 && walls[line][column + 1] == 1;
            boolean isRightLowerCorner = walls[line - 1][column] == 1 && walls[line][column + 1] == 1;
            boolean isLeftUpperCorner = walls[line][column - 1] == 1 && walls[line + 1][column] == 1;
            boolean isLeftLowerCorner = walls[line][column - 1] == 1 && walls[line - 1][column] == 1;

            if (isInner) {
                imageName = "wall_inner.png";
            } else if (isRight) {
                imageName = "wall_right.png";
            } else if (isLeft) {
                imageName = "wall_left.png";
            } else if (isRightUpperCorner) {
                if (random.nextBoolean()) {
                    imageName = "corner_right_top_1.png";
                } else {
                    imageName = "corner_right_top_2.png";
                }
            } else if (isRightLowerCorner) {
                if (random.nextBoolean()) {
                    imageName = "corner_right_bottom_1.png";
                } else {
                    imageName = "corner_right_bottom_2.png";
                }
            } else if (isLeftUpperCorner) {
                if (random.nextBoolean()) {
                    imageName = "corner_left_top_1.png";
                } else {
                    imageName = "corner_left_top_2.png";
                }
            } else if (isLeftLowerCorner) {
                if (random.nextBoolean()) {
                    imageName = "corner_left_bottom_1.png";
                } else {
                    imageName = "corner_left_bottom_2.png";
                }
                //troubleshooting case
            } else {
                imageName = "explosion_1.png";
            }
        }
        return imageName;
    }

    @Override
    public boolean tryToActivate(XWing xWing) {
        return (xWing.getPosition().getY() - this.getPosition().getY()) < 720;
    }
}
