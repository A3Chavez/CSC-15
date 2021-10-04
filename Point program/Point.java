public class Point
{
    //instance variables
    int x;
    int y;
    
    //constructor; (x, y)
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    //setter methods
    public void setX(int newX)
    {
        x = newX;
    }
    
    public void setY(int newY)
    {
        y = newY;
    }
    
    //getter methods
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    //toString method
    public String toString() //set up as needed
    {
        String s = null;
        return s;
    }
    
    //equals method
    public boolean isCollinear(Point p1, Point p2) //returns whether this point is collinear with the given two other points
    {
        if(this.x == p1.x || this.x == p2.x)
            return this.x == p1.x && this.x == p2.x;
        
        double m1 = ((double) (this.y - p1.y)) / (this.x - p1.x);
        double m2 = ((double) (this.y - p2.y)) / (this.x - p2.x);
    
        if(m1 == m2)
            return true;
        
        return false;
    }

    //additional function methods
    public void flip() //swaps the x/y coord (5, -3) --> (3, -5) or (4, 17) --> (-17, -4)
    {
        int temp = this.x;
        this.x = -this.y;
        this.y = -temp;
    }
        
    public int manhattanDistancePoint(Point other) //distance b/w current point and given other point
    {
        return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
    }
    
    public double slope(Point other) //returns slope of the line drawn b/w this point and the given other point
    {
        if(this.x == other.x)
            throw new IllegalArgumentException();
            
        return((double)(this.y - other.y)) / (this.x - other.x);
    }
    
    public double distance(Point other) //finds the distance b/w two points
    {
        double dist = 0;
        return dist = Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));
    }
    
    public boolean isVerticle(Point other) //returns true if given point lines up vertically with other given point
    {
        return this.x == other.x;
    }
    
    public boolean isHorizontal(Point other) //returns true if given point lines up horizontally with other given point
    {
        return this.y == other.y;
    }
    
    public int quadrant() //returns which quadrant of the x/y plane this point object falls in
    {
    	if (x > 0 && y > 0) 
        	return 1;
        else if (x < 0 && y > 0) 
        	return 2;
        else if (x < 0 && y < 0)
        	return 3;
        else if (x > 0 && y < 0) 
        	return 4; 
        else 
        	return 0;
    }
}