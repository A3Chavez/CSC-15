public class Circle
{
    //declare instance variables
    //private makes other classes unable to access variables and manipulate them
    private double x;
    private double y;
    private double radius;
    
    //constructor
    public Circle(double x, double y, double radius) //constructor
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    //"this." Not needed if no parameters are present
    public void Circle() //constructor
    {
        x = 1; y = 1; radius = 1;
    }
    
    //setter/mutator method
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    
    public void setX(double x)
    {
        this.x = x;
    }
    
    public void setY(double y)
    {
        this.y = y;
    }
    
    //getter methods
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public static double doSomething()
    {
        return 5;
    }
    
    public String toString()
    {
        String s = "";
        s = "x = " + x;
        s = s + "\ny = " + y;
        s = s + "\nRadius = " + radius;
        return s;
    }
    
    public boolean equals(Circle other) //c5 will be variable other, do not put two parameters
    {
        return this.x == other.x && this.y == other.y && this.radius == other.radius;
    }
    
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }
    
    public void shrinkCircle(double value)
    {
        if(radius - value > 0) //radius can’t be zero or negative
            radius = radius - value;
    }
}