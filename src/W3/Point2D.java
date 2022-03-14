package W3;

public class Point2D {

    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double[] getCoords() {
        double[] coords = new double[2];
        coords[0] = x;
        coords[1] = y;
        return coords;
    }
}
