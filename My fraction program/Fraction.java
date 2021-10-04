public class Fraction
{
    //instance variables
    private int deno;
    private int numerator;
    //constructor
    public Fraction(int numerator, int deno)
    {
        //this.deno = deno;
        this.numerator = numerator;
        setDeno(deno); //call setDeno method
    }
    //constructor; default object
    public Fraction()
    {
        deno = 1;
        numerator = 1;
    }
    //setter method; changes deno
    public void setDeno(int deno)
    {
        if(deno != 0)
            this.deno = deno;
        else
            deno = 1;
    }
    public void setNum(int numerator)
    {
        this.numerator = numerator;
    }
    public int getDeno()
    {
        return deno;
    }
    public int getNum()
    {
        return numerator;
    }
    public String toString()
    {
        String s = numerator + " / " + deno;
        return s;
    }
    private static int gcd(int a, int b)
    {
        int g = Math.min(a, b);
        for(int i = g; i > 0; i--)
        {
            if(a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }
    public Fraction simplify()
    {
        int g = gcd(numerator, deno);
        int d = deno / g;
        int n = numerator / g;
        Fraction f = new Fraction(n, d); //creates a Fraction object
        return f;
    }
    public boolean equals(Fraction other)
    {
        Fraction f1 = this.simplify();
        Fraction f2 = other.simplify();
        return f1.numerator == f1.numerator && f2.deno == deno;
    }
    public Fraction add(Fraction f)
    {
        int d = this.deno * f.deno;
        int n = this.numerator * f.deno + f.numerator * this.deno;
        Fraction f1 = new Fraction(n, d);
        return f1.simplify();
    }
    public Fraction divide(Fraction other)
    {
        int n = this.numerator * other.deno;
        int d = this.deno * other.numerator;
        Fraction f = new Fraction(n, d);
        return f.simplify();
    }
    public Fraction sqrt() //assume numerator and deno are perfect squares
    {
        int d = (int)Math.sqrt(deno);
        int n = (int)Math.sqrt(numerator);
        return new Fraction(n,d);
    }
}
