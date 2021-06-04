import java.util.Scanner;
public class PalindromeTest {
   static int count=0;
   static int revCount;
   public static boolean palindrome(String s)
   {
      revCount=s.length()-count-1;
      String s2=s.toLowerCase();
      if (count<s.length())
      {
         if(s2.charAt(count)==s2.charAt(revCount))
         {
            count+=1;
            palindrome(s);
         }
         else if(s2.charAt(count)!=s2.charAt(revCount))
         {
         System.out.printf("'%s' not a palindrome.\n", s);
         return false;
         }
      }
      return true;
   }
   public static void main(String [] args)
   {
      System.out.print("enter a string: ");
      Scanner kb = new Scanner(System.in);
      String str = kb.nextLine();
      if(palindrome(str))
         System.out.printf("'%s' is a palindrome.\n",str);
   }
}
