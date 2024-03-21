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
        x = x - 1;
    }

    public void left(double pixel) {
        for (int i = 0; i < pixel; i++) {
            left();
        }
    }

    //right
    public void right() {
        x = x + 1;
    }

    public void right(double pixel) {
        for (int i = 0; i < pixel; i++) {
            right();
        }
    }

    //up
    public void up() {
        y = y - 1;
    }

    public void up(double pixel) {
        for (int i = 0; i < pixel; i++) {
            up();
        }
    }

    //down
    public void down() {
        y = y + 1;
    }

    public void down(double pixel) {
        for (int i = 0; i < pixel; i++) {
            down();
        }
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
