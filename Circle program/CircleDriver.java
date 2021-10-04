public class CircleDriver
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(1, 2, 3);
        System.out.println();
        Circle c2 = new Circle(2,3,4);
        Circle c3 = new Circle(1, 2, 3);
        c3.setRadius(10); //use to change radius
        System.out.println("x: " + c1.getX());
        Circle.doSomething(); //use if method is static
        System.out.println(c1.toString()); //output variables; displays object
        System.out.println(c1); //does same thing as above
        Circle c4 = new Circle(1, 2, 5);
        Circle c5 = new Circle(3, 4, 5);
        if(c4.equals(c5))
            System.out.println("same");
    }
}
