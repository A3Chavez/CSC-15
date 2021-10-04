public class FractionDriver
{
   public static void main (String[] args)
   {
      run();
      Fraction[] fractions;
      fractions = populateArray();
      System.out.print(fractions);
   }
   
   public static void run()
   {
      Fraction f1 = new Fraction(1,2);
      System.out.println("f1 = " + f1);
      f1.toString();
      Fraction f2 = new Fraction(3,4);
      System.out.println("f2 = " + f2);
      //Comparing
      boolean same = f1.equals(f2);
      if(same)
         System.out.print(f1 +" is the same as "+ f2);
      else
         System.out.print(f1 + " is not the same as "+ f2);
      //add
      Fraction f = f1.add(f2);
      System.out.print(f1 + " + " + f2 + " = " + f);
      Fraction sub = f1.subtract(f2);
      System.out.print(f1 + " - " + f2 + " = " + f);
      Fraction f = f1.multi(f2);
      System.out.print(f1 + " * " + f2 + " = " + f);
   }
   /*
   Declare array of Objects
     For(  )
        { 
         1. get values for instance variables
         2. Create the object
         3. Store the reference of the object in the array
        }
    */
   public static Fraction[] populateArray()
   {
      Scanner kb = new Scanner(System.in);
      //Declare an array of Fractions
      Fraction[] fractions = new Fraction[10];
      for(int i = 0; i< fractions.length; i++)
      {
         //Get neumerator
         System.out.print("Enter Neumerator = ");
         int n = kb.nextInt();
         //Get the denominator
         System.out.print("Enter Denominator = ");
         int d = kb.nextInt();
         Fraction f = new Fraction(n,d);
         fractions[i] = f;
       }
   }
   
   public static void Fraction(fraction [] f)
   {
      for(int i = 0; i < f.length; i++)
      {
         System.out.println(f[i]);
      }
   }
   
   public static void add(Fraction[] fractions)
   {
      for(int i = 0; i < fractions.length; i++);
      {
         Fraction f = fractions[i].add(Fractions[i + 1]);
         System.out.println(fractions[i] + " + " + fractions[i + 1] + " = " + f);
      }
   }
}
      
      