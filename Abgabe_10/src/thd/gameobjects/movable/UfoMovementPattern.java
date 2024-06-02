package thd.gameobjects.movable;

import thd.gameobjects.base.MovementPattern;
import thd.gameobjects.base.Position;

import java.util.Random;

public class UfoMovementPattern extends MovementPattern {
    private final Ufo ufo;

    protected UfoMovementPattern(Ufo ufo) {
        super();
        this.ufo = ufo;
    }

    @Override
    protected Position nextTargetPosition(Position... referencePositions) {
        Random random = new Random();
        double x;

        if (random.nextBoolean()) {
            double min = 200;
            double max = 400;
            x = ufo.getPosition().getX() + (random.nextDouble(max - min + 1) + min);
        } else {
            double min = 200;
            double max = 400;
            x = ufo.getPosition().getX() - (random.nextDouble(max - min + 1) + min);
        }
        return new Position(x, ufo.getPosition().getY());
    }
}
