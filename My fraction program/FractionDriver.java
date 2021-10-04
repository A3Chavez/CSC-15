import java.util.*;

public class FractionDriver
{
    public static void main(String[] args)
    {
        run();
    }
    public static void run()
    {
        Fraction[] fractions = new Fraction[4];
        populate(fractions);
        add(fractions);
    }
    public static void populate(Fraction[] fractions)
    {
        Scanner kb = new Scanner(System.in);
        for(int i = 0; i < fractions.length; i++)
        {
            System.out.print("Enter the numerator: ");
            int n = kb.nextInt();
            System.out.print("Enter the denominator: ");
            int d = kb.nextInt();
            Fraction f = new Fraction(n, d);
            fractions[i] = f; //stores this data in the fraction array at i index
        }
    }
    public static void add(Fraction[] fractions)
    {
        for(int i = 0; i < fractions.length - 1; i++)
        {
            Fraction f = fractions[i].add(fractions[i + 1]);
            System.out.println(fractions[i] + " + " + fractions[i + 1] + " = " + f);
        }
    }
}
