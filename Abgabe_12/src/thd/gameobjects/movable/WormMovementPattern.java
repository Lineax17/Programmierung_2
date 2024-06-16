package thd.gameobjects.movable;

import thd.gameobjects.base.MovementPattern;
import thd.gameobjects.base.Position;

import java.util.Random;

class WormMovementPattern extends MovementPattern {
    private final Worm worm;

    protected WormMovementPattern(Worm worm) {
        super();
        this.worm = worm;
    }

}
