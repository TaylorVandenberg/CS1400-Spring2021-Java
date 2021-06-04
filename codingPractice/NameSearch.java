import java.io.*;
import java.util.*;
public class NameSearch
{
   public static void main(String[] args) throws IOException
   {
      Scanner kb = new Scanner(System.in);
      String answer = "yeeeeah";
      String[] boyNamesArr = new String[200];
      String[] girlNamesArr = new String[200];
      getNamesFromFile(boyNamesArr, "BoyNames.txt");
      getNamesFromFile(girlNamesArr, "GirlNames.txt");
      while(!answer.equals(""))
      {
         System.out.print("Enter a name (blank line to stop): ");
         answer = kb.nextLine();
         if(!answer.equals(""))
         {
            displaySearchResult(answer, boyNamesArr, girlNamesArr);
         }
         else{
            System.exit(0);
         }
      }
   }
   public static void getNamesFromFile(String[] array, String filename) 
throws IOException
   {
      File file = new File(filename);
      Scanner s = new Scanner(file);
      int i = 0;
      while (s.hasNext())
      {
         array[i] = s.nextLine();
         i++;
      }
      s.close();
   }
   public static int sequentialSearch(String[] array, String value)
   {
      for (int i=0; i<array.length; i++)
      {
         if (array[i].toLowerCase()==value.toLowerCase())
         {
            return i;
         }
         else
         {
            i= -1;
         }
      }
      return i;
   }
   public static void displaySearchResult(String input, String[] array1, String[] array2)
   {
      int boy = sequentialSearch(array1, input);
      int girl = sequentialSearch(array2, input);
      if(boy>=0)
      {
         System.out.println(input+" is a popular boy's name.");
      }
      else if(girl>=0)
      {
         System.out.println(input+" is a popular girl's name.");
      }
      else
      {
         System.out.println(input+" is not a popular name.");
      }
   }
}
