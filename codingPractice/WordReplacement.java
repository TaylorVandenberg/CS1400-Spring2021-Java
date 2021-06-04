import java.util.Scanner;
public class WordReplacement {
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.println("enter a line of text (blank line to stop)");
      String s1 = kb.nextLine();
      while (!s1.equals(""))
      {
         int position = s1.indexOf("hate");
         if(position==-1)
         {
            System.out.printf("\"%s\" is not found.\n", s1);
         }
         else{
            String starting = s1.substring(0, position);
            String ending = s1.substring(position+4);
            String line = starting + "love" + ending;
            System.out.println("I have rephrased that line to read: ");
            System.out.println(line);
         }
         System.out.println("\nenter another line (blank line to stop): ");
         s1 = kb.nextLine();
      }
   }
}
