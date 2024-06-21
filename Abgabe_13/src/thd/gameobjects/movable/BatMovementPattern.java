package thd.gameobjects.movable;

import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.MovementPattern;
import thd.gameobjects.base.Position;

import java.util.Random;

class BatMovementPattern extends MovementPattern {
    private final CollidingGameObject bat;

    protected BatMovementPattern(CollidingGameObject bat) {
        super();
        this.bat = bat;
    }

    @Override
    protected Position nextTargetPosition(Position... referencePositions) {

        Random random = new Random();
        double x = 600;
        double y = 600;
        /*
        if (random.nextBoolean()) {
            x = 0;
            y = 0;
        } else {
            x = 1280;
            y = 0;
        }


         */

        return new Position(x, y);
    }
}
