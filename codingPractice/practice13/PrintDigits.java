import java.util.Scanner;
public class PrintDigits {
   static int count=1;
   static int revCount=0;
   public static void printRightToLeft(Integer x)
   {
      String str = Integer.toString(x);
      if (count<=str.length())
      {
         System.out.println(str.charAt(str.length()-count));
         count+=1;
         printRightToLeft(x);
      }
   }
   public static void main(String [] args)
   {
      System.out.print("enter a positive integer: ");
      Scanner kb = new Scanner(System.in);
      Integer y = kb.nextInt();
      System.out.println("print n right to left...");
      printRightToLeft(y);

   }
}
