import java.util.Scanner;
public class StringComparisonWithWildCard
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String userWord1;
      String userWord2;
      int fail = 0;

      System.out.print("enter string 1: ");
      userWord1 = kb.nextLine();
      System.out.print("enter string 2: ");
      userWord2 = kb.nextLine();
      match(userWord1,userWord2);
   }

   public static boolean match(String userWord1, String userWord2)
   {
      int val1 = userWord1.length();
      int val2 = userWord2.length();

      if((val1 - val2) == 0)
      {
         while(!userWord1.equals(""))
         {

            for(int i=0, j=userWord1.length(); i<=j; i++)
            {
               int fail = 0;
               char word1Char = userWord1.charAt(i);
               char word2Char = userWord2.charAt(i);

               if(word1Char!=word2Char)
               {
                  System.out.println("they are different");
                  fail++;
                  break;
               }
               else if(fail <= 0)
               {
                  System.out.println("they are equal");
                  break;
               }
               return true;
            }
         }
      }
   }
}
