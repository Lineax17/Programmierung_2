package thd.gameobjects.movable;

import thd.game.managers.GamePlayManager;
import thd.game.utilities.GameView;
import thd.gameobjects.base.ActivatableGameObject;
import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.ShiftableGameObject;
import thd.gameobjects.unmovable.Wall;

import java.util.LinkedList;
import java.util.List;

/**
 * Describes a game object that looks like a bat.
 */
public class Bat extends CollidingGameObject implements ShiftableGameObject, ActivatableGameObject<XWing> {
    private final BatMovementPattern batMovementPattern;
    private boolean stop;
    private final List<CollidingGameObject> collidingGameObjectsForPathDecision;


    private enum State {
        STANDARD, EXPLODING
    }

    private State currentState;
    private StandardState standardState;
    private ExplodingState explodingState;
    private String imageName;

    /**
     * Initializes a new alien.
     *
     * @param gameView        Instance of {@link GameView}.
     * @param gamePlayManager Instance of {@link GamePlayManager}.
     * @see GameView
     * @see GamePlayManager
     */
    public Bat(GameView gameView, GamePlayManager gamePlayManager) {
        super(gameView, gamePlayManager);
        this.batMovementPattern = new BatMovementPattern(this);
        super.targetPosition = batMovementPattern.nextTargetPosition();
        super.size = 30;
        super.rotation = 0;
        super.width = 150;
        super.height = 33;
        super.speedInPixel = 2.5;
        distanceToBackground = 10;
        collidingGameObjectsForPathDecision = new LinkedList<>();
        currentState = State.STANDARD;
        standardState = StandardState.STANDARD_1;
        explodingState = ExplodingState.EXPLODING_1;
        hitBoxOffsets(0, 0, -120, 0);
    }

    @Override
    public void reactToCollisionWith(CollidingGameObject other) {
        if (currentState == State.STANDARD) {
            if (other instanceof XWingShot || other instanceof XWing) {
                switchToExplosion();
            }

            if (other instanceof Wall) {
                if (position.getY() < other.getPosition().getY()) {
                    position.up(2);
                } else if (position.getX() > other.getPosition().getX()){
                    position.right(3);
                } else if (position.getY() > other.getPosition().getY()) {
                    position.down(2);
                } else if (position.getX() < other.getPosition().getX()){
                    position.left(3);
                }
            }
        }
    }

    /**
     * Returns a string.
     *
     * @return name of object and position.
     */
    @Override
    public String toString() {
        return "Ufo: " + position;
    }

    @Override
    public void updatePosition() {
        position.moveToPosition(targetPosition, speedInPixel);
        if (position.similarTo(targetPosition)) {
            position.moveToPosition(batMovementPattern.nextTargetPosition(), speedInPixel);
        }


        for (int i = 0; i < collidingGameObjectsForPathDecision.size(); i++) {
            /*
            if (collidesWith(collidingGameObjectsForPathDecision.get(i))) {
                if (position.getX() < collidingGameObjectsForPathDecision.get(i).getPosition().getX()) {
                    position.right(5);

                } else {
                    position.left(5);

                }
                if (position.getY() < collidingGameObjectsForPathDecision.get(i).getPosition().getY()) {
                    position.up(5);

                } else {
                    position.down(5);
                }
            break;
            }

             */
        }


        if (position.getY() > 720) {
            gamePlayManager.destroyGameObject(this);
        }
    }

    private enum ExplodingState {
        EXPLODING_1("explosion_1.png"), EXPLODING_2("explosion_2.png"), EXPLODING_3("explosion_3.png"), EXPLODING_4("explosion_4.png");


        private final String display;

        ExplodingState(String display) {
            this.display = display;
        }
    }

    private enum StandardState {
        STANDARD_1("bat_1.png"), STANDARD_2("bat_2.png"), STANDARD_3("bat_3.png"), STANDARD_4("bat_2.png");


        private final String display;

        StandardState(String display) {
            this.display = display;
        }
    }

    @Override
    public void updateStatus() {
        shoot();
        switch (currentState) {
            case STANDARD -> {
                imageName = standardState.display;
                if (gameView.timer(200, this)) {
                    switchToNextStandardState();
                }
            }
            case EXPLODING -> {
                imageName = explodingState.display;
                if (gameView.timer(80, this)) {
                    switchToNextExplosionState();
                }
            }
        }
    }

    /**
     * Adds wall to collision list to manage collisons.
     *
     * @param wallsForPathDecision The List with the walls.
     */
    public void addWallsToCollisionList(List<CollidingGameObject> wallsForPathDecision) {
        collidingGameObjectsForPathDecision.addAll(wallsForPathDecision);
    }

    @Override
    public void addToCanvas() {
        gameView.addImageToCanvas(imageName, position.getX(), position.getY(), 2.0, rotation);
    }

    @Override
    public boolean tryToActivate(XWing xWing) {
        return position.getY() > -100;
    }

    private void shoot() {
        if (gameView.timer(4000, this)) {
            ShotUpwards shotUpwards = new ShotUpwards(gameView, gamePlayManager, this);
            shotUpwards.setShotSpeed(4);
            gamePlayManager.spawnGameObject(shotUpwards);

        }
    }

    private void switchToExplosion() {
        currentState = State.EXPLODING;
    }

    private void switchToNextStandardState() {
        int nextState = (standardState.ordinal() + 1) % StandardState.values().length;
        standardState = StandardState.values()[nextState];
    }

    private void switchToNextExplosionState() {
        int nextState = (explodingState.ordinal() + 1);
        if (nextState < ExplodingState.values().length) {
            explodingState = ExplodingState.values()[nextState];
        } else {
            gamePlayManager.destroyGameObject(this);
            gamePlayManager.addPoints(10);
        }
    }
}
