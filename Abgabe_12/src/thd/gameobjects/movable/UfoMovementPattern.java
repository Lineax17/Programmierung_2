package thd.gameobjects.movable;

import thd.game.utilities.GameView;
import thd.gameobjects.base.MovementPattern;
import thd.gameobjects.base.Position;

import java.util.Random;

class UfoMovementPattern extends MovementPattern {
    private final Ufo ufo;
    private boolean stop;

    protected UfoMovementPattern(Ufo ufo, GameView gameView) {
        super();
        this.ufo = ufo;
        stop = true;
        this.gameView = gameView;
    }

    @Override
    protected Position nextTargetPosition(Position... referencePositions) {
        Random random = new Random();
        double x;
        double y;

        if (random.nextBoolean()) {
            double min = 200;
            double max = 400;
            x = ufo.getPosition().getX() + (random.nextDouble(max - min + 1) + min);
            y = ufo.getPosition().getY();
        } else {
            double min = 200;
            double max = 400;
            x = ufo.getPosition().getX() - (random.nextDouble(max - min + 1) + min);
            y = ufo.getPosition().getY();
        }



        return new Position(x, y);
    }

    Position downwardPosition(Position... referencePositions) {
        double x;
        double y;

        x = ufo.getPosition().getX();
        y = ufo.getPosition().getY() + 50;


        return new Position(x, y);
    }


}
