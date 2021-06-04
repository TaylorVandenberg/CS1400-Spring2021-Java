import java.util.Random;
import java.util.Scanner;
public class Lottery
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.println("welcome to play Lottery..."
                        +"\n1. enter your own lottery number"
                        +"\n2. get a computer-generated lottery"
                        +" number");
      System.out.print("your choice: ");
      int choice = kb.nextInt();
      kb.nextLine();

      if(choice == 1)
      {
         int[] lotteryNumbers = generateLotteryNumber();
         int[] pickedNumbers = new int[5];
         for(int i = 0; i< pickedNumbers.length; i++)
            {
               pickedNumbers[i] = kb.nextInt();
            }
         printResult(lotteryNumbers, pickedNumbers);
         
      }
      else if(choice == 2)
      {
         int[] lotteryNumbers = generateLotteryNumber();
         int[] pickedNumbers = generateLotteryNumber();
         printResult(lotteryNumbers, pickedNumbers);
      }
      else
      {
         System.out.println("This choice is invalid");
         System.exit(0);
      }
   }
   public static int[] generateLotteryNumber()
   {
      int[] a = new int[5];
      Random random = new Random();
      for (int i=0; i < a.length; i++)
      {
         a[i] = random.nextInt(10);
      }
      return a;
   }
   public static int compareNumbers(int[] lottery, int[] picks)
   {
      int count = 0;
      for(int i=0; i<lottery.length; i++)
      {
         if(lottery[i] == picks[i])
         {
            count++;
         }
      }
      return count;
   }
   public static void printResult(int[] lottery, int[] picks)
   {
      int count = compareNumbers(lottery, picks);
      System.out.println("\nThe Lottery Number is:");
      printArray(lottery);
      System.out.println("Your Number is:");
      printArray(picks);
      System.out.println("There are "+count+" matching digits.");
   }
   public static void printArray(int[] a)
   {
      for (int i=0; i<a.length; i++)
         System.out.print(a[i] + "  ");
      System.out.println();
   }
}
