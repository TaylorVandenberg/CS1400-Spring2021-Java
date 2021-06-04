import java.util.Scanner;
public class PrimeChecker
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      boolean value;
      int userNum;

      System.out.print("Enter a number: ");
      userNum = kb.nextInt();
      if (userNum <=1)
      {
         System.out.println("That is not a prime number.");
         System.exit(0);
      }
      if (isPrime(userNum))
      {
         System.out.println("That is a prime number.");
      }
      else
      {
         System.out.println("That is not a prime number.");
      }

   }

   public static boolean isPrime(int userNum)
   {
      for (int i = 2; i <= userNum; i++)
      {
         if (userNum%i == 0)
         {
            return false;
         }
         else
            continue;
      }
      return true;
   }

}
