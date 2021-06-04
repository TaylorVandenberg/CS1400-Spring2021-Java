import java.util.Scanner;
import java.io.*;
public class FileIOTest
{
   public static void main(String[] args) throws IOException
   {
      FileIO obj = new FileIOSubClass();
      Scanner kb = new Scanner(System.in);
      System.out.print("Please enter an input file name: ");
      String inFile = kb.nextLine();
      System.out.println("Test fileRead(String) --");
      obj.fileRead(inFile);

      System.out.print("please enter an output file name: ");
      String outFile = kb.nextLine();
      System.out.print("enter how many lines you have to print to the output file: ");
      int size = kb.nextInt();
      kb.nextLine();
      String[] array = new String[size];
      for (int i=0; i<size; i++)
      {
         System.out.print("enter line " + (i+1) + ": ");
         array[i] = kb.nextLine();
      }
      System.out.println("Test fileWrite --");
      obj.fileWrite(outFile, array);
      System.out.println("check output file: " +outFile);
      
      System.out.print("enter another input filename: ");
      String inFile2 = kb.nextLine();
      File myFile = new File(inFile2);
      System.out.println("Test fileRead(File) -- ");
      ((FileIOSubClass)obj).fileRead(myFile);
   }
}
