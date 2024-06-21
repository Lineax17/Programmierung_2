package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.GameObject;
import thd.gameobjects.base.Position;
import thd.gameobjects.unmovable.Wall;

class AlienShot extends CollidingGameObject {
    private final GameObject alien;
    private final Position xwingPosition;
    private boolean isAbove;
    private boolean isRight;

    /**
     * Initializes a new Shot.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @param xWing           Instance of {@link XWing}.
     * @param alien           Instance of {@link Alien}.
     * @see GameView
     * @see GamePlayManager
     * @see XWing
     * @see Alien
     */
    AlienShot(GameView gameView, GamePlayManager gamePlayManager, XWing xWing, GameObject alien) {
        super(gameView, gamePlayManager);
        xwingPosition = new Position(xWing.getPosition().getX(), xWing.getPosition().getY());
        this.alien = alien;
        super.size = 2;
        position.updateCoordinates(this.alien.getPosition());
        super.rotation = 0;
        super.width = 10;
        super.height = 10;
        super.speedInPixel = 2;
        calculateTargetPosition();
        distanceToBackground = 50;
        isAbove = xwingPosition.getY() < position.getY();
        isRight = xwingPosition.getX() > position.getX();
        hitBoxOffsets(0, 0, 0, 0);
    }

    public void calculateTargetPosition() {
        double x;
        double y;

        x = 10*xwingPosition.getX() - 9*alien.getPosition().getX();
        y = 10*xwingPosition.getY() - 9*alien.getPosition().getY();

        targetPosition = new Position(x, y);

    }

    @Override
    public String toString() {
        return "AlienShot: " + position;
    }

    @Override
    public void updatePosition() {
        /*
        if (isAbove){
            position.up();
            if (isRight) {
                position.right(2);
            } else {
                position.left(2);
            }
        } else {
            position.down();
            if (isRight) {
                position.right(2);
            } else {
                position.left(2);
            }
        }

         */


        position.moveToPosition(targetPosition, speedInPixel);
        //System.out.println(targetPosition);
    }

    @Override
    public void addToCanvas() {
        gameView.addBlockImageToCanvas(EnemyShotBlockImages.ENEMYSHOT, position.getX(), position.getY(), size, rotation);
    }


    @Override
    public void reactToCollisionWith(CollidingGameObject other) {
        if (other instanceof Wall) {
            gamePlayManager.destroyGameObject(this);
        }
    }

}
