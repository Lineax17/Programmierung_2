package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.MovementPattern;
import thd.gameobjects.base.Position;

import java.util.Random;

class AlienMovementPattern extends MovementPattern {
    private final Alien alien;
    private final GameView gameView;

    protected AlienMovementPattern(Alien alien, GameView gameView) {
        super();
        this.alien = alien;
        this.gameView = gameView;
    }

    @Override
    protected Position nextTargetPosition(Position... referencePositions) {
        Random random = new Random();
        double x;

        if (random.nextBoolean()) {
            double min = 200;
            double max = 400;
            x = alien.getPosition().getX() + (random.nextDouble(max - min + 1) + min);
        } else {
            double min = 200;
            double max = 400;
            x = alien.getPosition().getX() - (random.nextDouble(max - min + 1) + min);
        }
        return new Position(x, alien.getPosition().getY());
    }

    protected void horizontalMove() {
        Random random = new Random();

        if (random.nextBoolean()) {
            alien.getPosition().left();
            if (gameView.timer(1000, this)) {
                alien.getPosition().right();
            }
        } else {
            alien.getPosition().right();
            if (gameView.timer(1000, this)) {
                alien.getPosition().left();
            }
        }
    }

}
