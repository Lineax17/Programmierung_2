package game;

public class Position {
    private double x;
    private double y;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Position() {
        this(0, 0);
    }

    public Position(Position otherPosition) {
        this(otherPosition.getX(), otherPosition.getY());
    }

    //left
    public void left() {
        left(1);
    }

    public void left(double pixel) {
        x = x - pixel;
    }

    //right
    public void right() {
        right(1);
    }

    public void right(double pixel) {
        x = x + pixel;
    }

    //up
    public void up() {
        up(1);
    }

    public void up(double pixel) {
        y = y - pixel;
    }

    //down
    public void down() {
        down(1);
    }

    public void down(double pixel) {
        y = y + pixel;
    }

    public void updateCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void updateCoordinates(Position otherPosition) {
        x = otherPosition.getX();
        y = otherPosition.getY();
    }

    @Override
    public String toString() {
        return "Position (" + (int) Math.round(x) + ", " + (int) Math.round(y) + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
