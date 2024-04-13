package thd.gameobjects.movable;

import thd.gameobjects.base.Position;

import java.util.Random;

class AlienMovementPattern {
    private final Random random;
    private final Alien alien;

    protected AlienMovementPattern(Alien alien) {
        this.alien = alien;
        random = new Random();
    }

    Position nextTargetPosition() {
        double min = -20;
        double max = 20;
        double x = alien.getPosition().getX() + random.nextDouble(max - min + 1) + min;
        double y = alien.getPosition().getY() + random.nextDouble((max+5) - min + 1) + min;
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
