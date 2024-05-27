package thd.gameobjects.base;

public class Direction {

    private double directionInDegrees;

    public Direction(double directionInDegrees) {
        this.directionInDegrees = directionInDegrees;
    }

    public void setDirectionInDegrees(double directionInDegrees) {
        this.directionInDegrees = directionInDegrees % 360;
    }

    //public Position nextPosition(Position position, double speedInPixel) {}
}
