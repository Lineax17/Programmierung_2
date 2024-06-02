package thd.gameobjects.movable;

import thd.gameobjects.base.MovementPattern;
import thd.gameobjects.base.Position;

import java.util.Random;

public class BatMovementPattern extends MovementPattern {
    private final Bat bat;

    protected BatMovementPattern(Bat bat) {
        super();
        this.bat = bat;
    }

    @Override
    protected Position nextTargetPosition(Position... referencePositions) {
        Random random = new Random();
        double x;

        if (random.nextBoolean()) {
            double min = 200;
            double max = 400;
            x = bat.getPosition().getX() + (random.nextDouble(max - min + 1) + min);
        } else {
            double min = 200;
            double max = 400;
            x = bat.getPosition().getX() - (random.nextDouble(max - min + 1) + min);
        }
        return new Position(x, bat.getPosition().getY());
    }
}
