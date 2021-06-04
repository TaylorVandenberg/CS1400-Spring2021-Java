import java.util.Scanner;
public class WordReplacementWithMethod {
   public static void wordReplacement(String str1, String str2, String str3)
   {
      while (!str1.equals(""))
      {
         int position = str1.indexOf(str2);
         if(position==-1)
         {
            System.out.printf("\"%s\" is not found.\n", str2);
            return;
         }
         else{
            String starting = str1.substring(0, position);
            String ending = str1.substring(position+str2.length());
            String line = starting + str3 + ending;
            System.out.println("I have rephrased that line to read: ");
            System.out.println(line);
            return;
         }
      }
   }
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.println("enter a line of text (blank to stop):");
      String s1 = kb.nextLine();
      while(!s1.equals(""))
      {
         System.out.print("enter a substring to be replaced: ");
         String s2 = kb.nextLine();
         System.out.print("enter the new substring: ");
         String s3 = kb.nextLine();
         wordReplacement(s1, s2, s3);
         System.out.println("\nenter another line (blank line to stop):");
         s1 = kb.nextLine();
      }
   }
}
