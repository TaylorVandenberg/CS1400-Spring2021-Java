import java.io.*;
import java.util.*;
public class SelectionSort {
   public static void main(String[] args) throws IOException
   {
      final int SIZE = 100;
      int[] myArray = new int[SIZE];
      int counter = 0;
      File file = new File("data.txt");
      Scanner s = new Scanner(file);
      if(!file.exists())
      {
         System.out.println("file not found");
         System.exit(0);
      }
      while (s.hasNext() && counter < myArray.length)
      {
         myArray[counter] = s.nextInt();
         counter++;
      }
      s.close();
      selectionSort(myArray, counter);
      outputData(myArray, counter);
      for(int i=0; i<counter; i++)
      {
         System.out.printf("%4d",myArray[i]);
      }
   }
   public static void selectionSort(int[] array, int counter)
   {
      int minIndex, temp;

      for (int i = 0; i < (counter-1); i++)
      {
         minIndex = i;
         for(int j = i+1; j < counter; j++)
         {
            if (array[j] < array[minIndex])
               minIndex = j;
         }
         temp = array[i];
         array[i] = array[minIndex];
         array[minIndex] = temp;
      }
   }
   public static void outputData(int[] array, int counter) throws IOException
   {
      PrintWriter outputFile = new PrintWriter("data.out");
      for (int i = 0; i < counter; i++)
      {
         if (i % 10 == 0)
               outputFile.println();
            outputFile.printf("%4d\t", array[i]);
      }
      outputFile.close();
   }
}

