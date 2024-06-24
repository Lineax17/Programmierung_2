package thd.gameobjects.movable;

import thd.gameobjects.base.CollidingGameObject;
import thd.gameobjects.base.MovementPattern;
import thd.gameobjects.base.Position;

class BatMovementPattern extends MovementPattern {
    private final CollidingGameObject bat;

    protected BatMovementPattern(CollidingGameObject bat) {
        super();
        this.bat = bat;
    }

    @Override
    protected Position nextTargetPosition(Position... referencePositions) {

        double x = 600;
        double y = 600;


        return new Position(x, y);
    }
}
