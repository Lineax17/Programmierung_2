package thd.gameobjects.movable;

import thd.gameobjects.base.GameObject;
import thd.gameobjects.base.MovementPattern;
import thd.gameobjects.base.Position;

class TurretMovementPattern extends MovementPattern {
    private final GameObject object;

    protected TurretMovementPattern(GameObject object) {
        super();
        this.object = object;
    }

    @Override
    protected Position nextTargetPosition(Position... referencePositions) {
        double y = object.getPosition().getY() + 3;
        return new Position(object.getPosition().getX(), y);
    }

    @Override
    protected Position startPosition(Position... referencePositions) {
        double x = random.nextDouble(201) + 860; // 860 + (0-200)
        double y = random.nextDouble(101) - 200;
        return new Position(x, y);
    }
}
