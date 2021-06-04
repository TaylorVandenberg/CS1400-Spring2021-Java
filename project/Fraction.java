//Taylor Vandenberg
//CS1400, section 03
//Project 5 - Arithmetic Operations with Fractions
//4-5-21
import java.util.Scanner;
public class Fraction
{
   private int numerator;
   private int denominator;
   private static int created;

   public Fraction()
   {
      numerator=0;
      denominator=1;
      created++;
   }

   public Fraction(int num, int denom)
   {
      validate(num, denom);
      created++;
   }

   public Fraction add(Fraction obj)
   {
      int num1 = obj.numerator * denominator;
      int num2 = numerator * obj.denominator;
      int newDenom = denominator * obj.denominator;
      int newNum = num1+num2;
      Fraction w = new Fraction(newNum, newDenom);
      return w;
   }

   public Fraction subtract(Fraction obj)
   {
      int num1 = obj.numerator * denominator;
      int num2 = numerator * obj.denominator;
      int newDenom = denominator * obj.denominator;
      int newNum = num2-num1;
      Fraction x = new Fraction(newNum, newDenom);
      return x;
   }

   public Fraction multiply(Fraction obj)
   {
      int newNum = numerator * obj.numerator;
      int newDenom = denominator * obj.denominator;
      Fraction y = new Fraction(newNum, newDenom);
      return y;
   }

   public Fraction divide(Fraction obj)
   {
      int newNum = numerator * obj.denominator;
      int newDenom = denominator * obj.numerator;
      Fraction z = new Fraction(newNum, newDenom);
      return z;
   }

   public String toString()
   {
      return numerator+"/"+denominator;
   }

   public float printAsFloat()
   {
      float decimal = (float) numerator / denominator;
      return decimal;
   }

   public static int numberOfFractions()
   {
      return created;
   }

   public static Fraction read()
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("enter an integer numerator: ");
      int userNum = kb.nextInt();
      System.out.print("enter an integer denominator: ");
      int userDenom = kb.nextInt();
      return new Fraction(userNum, userDenom);
   }

   private int gcd(int num1, int num2)
   {
      while (num1 != num2)
      {
         if (num1 > num2)
            num1 = num1 - num2;
         else
            num2 = num2 - num1;
      }
      return num1;
   }

   private void validate(int num, int denom)
   {
      int comDenom;
      if (denom == 0)
      {
         System.out.println("denominator cannot be 0");
         System.out.println("the fraction is set to 0/1");
         num=0;
         denom=1;
      }
      if(num == 0)
      {
         denom=1;
      }
      if(denom < 0)
      {
         denom *= -1;
         num *= -1;
      }
      if (num > 0)
      {
         comDenom = gcd(num, denom);
         numerator = num/comDenom;
         denominator = denom/comDenom;
      }
      else if (num == 0)
      {
         numerator = 0;
         denominator = 1;
      }
      else
      {
         num *= -1;
         comDenom = gcd(num, denom);
         num *= -1;
         numerator = num/comDenom;
         denominator = denom/comDenom;
      }
   }
}
