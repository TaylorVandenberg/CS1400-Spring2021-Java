import java.util.Scanner;
import java.util.ArrayList;
public class PhoneBookTest {
   public static void main(String[] args){
      Scanner kb = new Scanner(System.in);
      ArrayList<String> phoneBook = new ArrayList<String>();
      String name, number;
      int i=1;
      System.out.println("I'm going to ask you to enter 5 names and phone numbers.");
      while (i <= 5)
      {
         System.out.print("Enter a person's name: ");
         name = kb.nextLine();
         System.out.print("Enter that person's phone number: ");
         number = kb.nextLine();
         PhoneBookEntry entry = new PhoneBookEntry(name, number);
         phoneBook.add(entry.toString());
         i++;
      }
      System.out.println("\nHere's the date you entered:");
      for (int index = 0; index < phoneBook.size(); index++)
      {
   	      System.out.println(phoneBook.get(index));
      }
      System.out.println("\nInsert my name to the beginning of the phone book:");
      phoneBook.add(0, "(T Vandenberg, 415-6731)");
      System.out.println(phoneBook);
      System.out.println("\nRemove the last entry:");
      phoneBook.remove(5);
      System.out.println(phoneBook);
   }
}
