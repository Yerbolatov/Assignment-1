package models;

import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    private ArrayList<Point> points = new ArrayList<>();
    // addPoint(Point) - adds to the container
    public void addPoint(Point point) {
        points.add(point);
    }
    // calculatePerimeter()
    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i=0; i<points.size(); i++) {
            Point point = points.get(i);
            Point point2 = points.get((i+1) % points.size());
            perimeter += (point.distance(point2));
        }
        return perimeter;
    }
    // getAverageSide()
    public double getAverageSide() {
        double length = calculatePerimeter();
        return length/points.size();
    }
    // getLongestSide()
    public double getLongestSide() {
        double longestSide = 0;
        for (int i=0; i<points.size(); i++) {
            Point point = points.get(i);
            Point point2 = points.get((i+1) % points.size());
            double side = point.distance(point2);
            if (side > longestSide) {
                longestSide = side;
            }
        }
        return longestSide;
    }
}
