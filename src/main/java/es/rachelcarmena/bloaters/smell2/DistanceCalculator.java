package es.rachelcarmena.bloaters.smell2;

public class DistanceCalculator {
    public double betweenPoints(Point point1, Point point2) {
        return Math.sqrt(Math.pow((point2.getY() - point1.getY()), 2) + Math.pow(point2.getX() - point1.getX(), 2));
    }

    public double toOriginFrom(Point point) {
        return Math.sqrt(Math.pow(point.getY(), 2) + Math.pow(point.getX(), 2));
    }
}
