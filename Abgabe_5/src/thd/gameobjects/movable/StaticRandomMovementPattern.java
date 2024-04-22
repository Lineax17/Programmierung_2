package thd.gameobjects.movable;

import thd.gameobjects.base.GameObject;
import thd.gameobjects.base.MovementPattern;
import thd.gameobjects.base.Position;

class StaticRandomMovementPattern extends MovementPattern {
    private final GameObject object;

    protected StaticRandomMovementPattern(GameObject object) {
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
        double min = 320;
        double max = 690;
        double x = random.nextDouble(max - min + 1) + min;
        double y = (random.nextDouble(max - min + 1) + min) * -1;
        return new Position(x, y);
    }
}
