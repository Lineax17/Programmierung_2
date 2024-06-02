package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.Position;
import thd.gameobjects.unmovable.Wall;

class AlienShotBlockImages extends CollidingGameObject {

    private static final String SHOT = """
              W
             WWW
             RWR
            WWRWW
            WWRWW
            """;
    private final XWing xWing;
    private final Alien alien;
    private final Position xwingPosition;
    boolean isAbove;
    boolean isRight;

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
    AlienShotBlockImages(GameView gameView, GamePlayManager gamePlayManager, XWing xWing, Alien alien) {
        super(gameView, gamePlayManager);
        this.xWing = xWing;
        xwingPosition = new Position(xWing.getPosition().getX(), xWing.getPosition().getY());
        this.alien = alien;
        super.size = 2;
        position.updateCoordinates(this.alien.getPosition());
        super.rotation = 0;
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 2;
        distanceToBackground = 50;
        isAbove = xwingPosition.getY() > position.getY();
        isRight = xwingPosition.getX() > position.getX();
        hitBoxOffsets(0, 0, -120, 0);
    }

    @Override
    public String toString() {
        return "AlienShot: " + position;
    }


    //try with two booleans in constructor (isAbove, isRight)
    @Override
    public void updatePosition() {
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
        //position.moveToPosition(targetPosition, speedInPixel);
    }

    @Override
    public void addToCanvas() {
        gameView.addBlockImageToCanvas(SHOT, position.getX(), position.getY(), size, rotation);
    }


    @Override
    public void reactToCollisionWith(CollidingGameObject other) {
        if (other instanceof Wall) {
            gamePlayManager.destroyGameObject(this);
        }
    }

}
