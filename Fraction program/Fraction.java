import java.util.*;
public class Fraction
{
   private int deno;
   private int neum;
   
   public Fraction (int deno, int neum)
   { 
      this.deno = deno;
      this.neum = neum;
      setDeno(deno);
   }
   
   public Fraction()
   {
      deno = 1;
      neum = 1;
      return neum + deno;
   }
   
   public void setDeno(int deno)
   {
      if(deno != 0)
         this.deno = deno;
      else
         this.deno = 1;
   }
   public void setNeum(int neum)
   {
      if(neum != 0)
         this.neum = neum;
   }
   //accessor
   public int getDeno()
   {
      return deno;
   }
   
   public int getNeum()
   {
      return neum;
   }
   
   public String toString()
   {
      return neum + "/" + deno;
   }
   
   public boolean equals(Fraction other)
   {
      double f1 = this.simplify();
      double f2 = this.other.simplify();
      return f1 == f2;
   }
   
   public Fraction simplify()
   {
      int gcd = Math.min(this.deno/this.neum);
      while(this.deno % gcd!=0 && this.neum % gcd!=0)
      {
         gcd--;
      }
      
      int d = this.deno/gcd;
      int n = this.neum/gcd;
      
      Fraction f = new Fraction(n,d);
      return f;
   }
   
   public Fraction add(Fraction other)
   {
      int d = this.deno * other.deno;
      int n = this.neum * other.deno + this.deno * other.neum;
      Fraction f = new Fraction (n,d);
      return f.simplify();
   }
   
   public Fraction multiply(other Fraction)
   {
      int d = this.deno * other.deno;
      int n = this.neum * other.neum;
      Fraction f = new Fraction (n,d);
      f = f.simplify();
      return f;
   }
   
   public Fraction reverse()
   {
      int n = this.deno;
      int d = this.neum;
      Fraction f = new Fraction(n,d);
      return f;
   }
} 
  
public class FractionDriver
{
   public static void main(String[] args)
   {
      Fraction f1 = new Fraction(7,3);
      Fraction f2 = new Fraction(2,5);
      Fraction f3 = f1.add(f2);
      Fraction f4 = f1.multiply(f2);
      Fraction f5 = f1.divide(f2);
   }
}
