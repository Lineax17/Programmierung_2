package thd.gameobjects.movable;

import thd.gameobjects.base.MovementPattern;
import thd.gameobjects.base.Position;

import java.util.Random;

class BatMovementPattern extends MovementPattern {
    private final Bat bat;

    protected BatMovementPattern(Bat bat) {
        super();
        this.bat = bat;
    }

    @Override
    protected Position nextTargetPosition(Position... referencePositions) {
        Random random = new Random();
        double x = 0;
        double y = 0;
        

        return new Position(x, y);
    }
}
