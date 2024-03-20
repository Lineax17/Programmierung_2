package game;

public class Position {
    private double x;
    private double y;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void left() {
        x = x - 1;
    }

    public void right() {
        x = x + 1;
    }

    public void up() {
        y = y - 1;
    }

    public void down() {
        y = y + 1;
    }

    @Override
    public String toString() {
        return "Position (" + (int) Math.round(x) + "; " + (int) Math.round(y) + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
