package W3;

public class Line {

    public static Point2D findPoint(Point2D a, Point2D b, double d) {
        //d can only be between 0 and 1, return null if it not.
        //Find the point that
        if (d >= 0 && d <= 1) {
            double x = a.getX() + ((b.getX() - a.getX()) * d);
            double y = a.getY() + ((b.getY() - a.getY()) * d);
            return new Point2D(x, y);
        }
        else
            return null;
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(2.0, 3.5);
        Point2D b = new Point2D(1.0, 3.5);
        Point2D p = Line.findPoint(a, b, 0.5);
        if (p != null) {
            System.out.println(p.getCoords());
        }
    }

}