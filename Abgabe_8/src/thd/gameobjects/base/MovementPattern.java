package thd.gameobjects.base;

import java.util.Random;

/**
 * Is the base class for every movement pattern of the gameobjects.
 */
public abstract class MovementPattern {
    protected final Random random;
    protected int currentIndex;

    /**
     * Initializes a new movementpattern.
     */
    protected MovementPattern() {
        random = new Random();
    }

    /**
     * Sets the position where the gameobject spawns.
     *
     * @param referencePositions other positions.
     * @return the starting position.
     */
    protected Position startPosition(Position... referencePositions) {
        return new Position(0, 0);
    }

    /**
     * Sets the next targetposition for the gameobject.
     *
     * @param referencePositions other positions.
     * @return the next targetposition.
     */
    protected Position nextTargetPosition(Position... referencePositions) {
        return new Position(0, 0);
    }


}
