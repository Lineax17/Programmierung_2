package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.GameObject;
import thd.gameobjects.base.MovementPattern;
import thd.gameobjects.base.Position;

class ShotMovementPattern extends MovementPattern {
    private final GameObject object;

    protected ShotMovementPattern(GameObject object) {
        super();
        this.object = object;
    }

    @Override
    protected Position nextTargetPosition(Position... referencePositions) {
        double y = object.getPosition().getY() - 3;
        return new Position(object.getPosition().getX(), y);
    }

    @Override
    protected Position startPosition(Position... referencePositions) {
        return new Position(GameView.WIDTH / 2, 600);
    }
}
