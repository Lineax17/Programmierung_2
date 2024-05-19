package thd.gameobjects.movable;

import thd.gameobjects.base.MovementPattern;
import thd.gameobjects.base.Position;

import java.util.Random;

class AlienMovementPattern extends MovementPattern {
    private final Alien alien;

    protected AlienMovementPattern(Alien alien) {
        super();
        this.alien = alien;
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

}
