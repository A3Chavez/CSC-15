public class PointDriver
{
    public static void main(String[] args)
    {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(4, 10);
        System.out.println("Is collinear: " + p1.isCollinear(p1, p2));
        System.out.println("Manhattan Distance Point: " + p1.manhattanDistancePoint(p2));
        System.out.printf("Slope of the two p1 and p2: %.2f\n", p1.slope(p2));
        System.out.printf("Distance: %.2f\n", p1.distance(p2));
        System.out.println("Is verticle: " + p1.isVerticle(p2));
        System.out.println("Is Horizontal: " + p1.isHorizontal(p2));
        System.out.println("Point 1 exists in the " + p1.quadrant() + "Quadrant");
    }
}