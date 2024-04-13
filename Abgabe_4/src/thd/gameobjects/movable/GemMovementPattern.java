package thd.gameobjects.movable;

import thd.gameobjects.base.MovementPattern;
import thd.gameobjects.base.Position;
class GemMovementPattern extends MovementPattern {
    private final Gem gem;
    private boolean directionIsRight;

    protected GemMovementPattern(Gem gem) {
        super();
        this.gem = gem;
        direction();
    }

    private boolean direction() {
        double randomDouble = random.nextDouble() * 10;
        if (randomDouble <= 5) {
            directionIsRight = false;
        } else {
            directionIsRight = true;
        }
        return directionIsRight;
    }

    @Override
    protected Position nextTargetPosition(Position... referencePositions) {
        double x;
        if (directionIsRight) {
            x = gem.getPosition().getX() + 10;
        } else {
            x = gem.getPosition().getX() - 10;
        }
        double y = gem.getPosition().getY() + 10;
        return new Position(x, y);
    }

    @Override
    protected Position startPosition(Position... referencePositions) {
        double min = 320;
        double max = 690;
        double x = random.nextDouble(max - min + 1) + min;
        double y = 0;
        return new Position(x, y);
    }
}
