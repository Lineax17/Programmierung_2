package thd.gameobjects.movable;

import thd.gameobjects.base.Position;

class QuadraticMovementPattern {

    private final Position[] pattern;
    private int currentIndex;

    protected QuadraticMovementPattern() {
        pattern = new Position[]{
                new Position(100, 100),
                new Position(1100, 100),
                new Position(1100, 600),
                new Position(100, 600)};
        currentIndex = -1;
    }

    Position nextTargetPosition() {
        currentIndex++;
        if (currentIndex >= pattern.length) {
            currentIndex = 0;
        }
        return pattern[currentIndex];
    }


    private Position startPosition() {
        return nextTargetPosition();
    }
}
