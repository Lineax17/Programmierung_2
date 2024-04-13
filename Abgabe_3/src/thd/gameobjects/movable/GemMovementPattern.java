package thd.gameobjects.movable;

import thd.gameobjects.base.Position;

import java.util.Random;

class GemMovementPattern {
    private final Gem gem;
    private final Random random;
    private boolean directionIsRight;
    protected GemMovementPattern(Gem gem) {
        random = new Random();
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

    Position nextTargetPosition() {
        double x;
        if (directionIsRight) {
            x = gem.getPosition().getX() + 10;
        } else {
            x = gem.getPosition().getX() - 10;
        }
        double y = gem.getPosition().getY() + 10;
        return new Position(x, y);
    }

    Position startPosition() {
        double min = 320;
        double max = 690;
        double x = random.nextDouble(max - min + 1) + min;
        double y = 0;
        return new Position(x, y);
    }
}
