package thd.gameobjects.movable;

import thd.gameobjects.base.MovementPattern;
import thd.gameobjects.base.Position;

import java.util.Random;

class WormMovementPattern extends MovementPattern {
    private final Worm worm;

    protected WormMovementPattern(Worm worm) {
        super();
        this.worm = worm;
    }

    @Override
    protected Position nextTargetPosition(Position... referencePositions) {
        Random random = new Random();
        double x;

        if (random.nextBoolean()) {
            double min = 200;
            double max = 400;
            x = worm.getPosition().getX() + (random.nextDouble(max - min + 1) + min);
        } else {
            double min = 200;
            double max = 400;
            x = worm.getPosition().getX() - (random.nextDouble(max - min + 1) + min);
        }
        return new Position(x, worm.getPosition().getY());
    }
}
