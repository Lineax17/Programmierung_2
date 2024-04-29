package thd.gameobjects.movable;

import thd.gameobjects.base.MovementPattern;
import thd.gameobjects.base.Position;
class AlienMovementPattern extends MovementPattern {
    private final Alien alien;

    protected AlienMovementPattern(Alien alien) {
        super();
        this.alien = alien;
    }

    @Override
    protected Position nextTargetPosition(Position... referencePositions) {
        double min = -20;
        double max = 20;
        double x = alien.getPosition().getX() + (random.nextDouble(max - min + 1) + min) * 2;
        double y = alien.getPosition().getY() + (random.nextDouble((max + 5) - min + 1) + min) * 2;
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
