import java.util.*;
import java.io.*;
public class BinarySearch {
   public static void main(String[] args) throws IOException
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("enter a number: ");
      int userNum = kb.nextInt();
      int[] myArray = {15,20,25,30,25,40};
      int position = binarySearch(myArray, userNum);
      if (position < 0)
         System.out.println(userNum + " is not in the array");
      else
         System.out.println(userNum + " is at position " + position);
   }
   public static int binarySearch(int[] a, int target)
   {
      int first = 0,
          last = a.length - 1,
          mid;
      while (first <= last)
      {
         mid = (first + last) / 2;
         if (target == a[mid])
            return mid;
         if (target < a[mid])
            last = mid - 1;
         else 
            first = mid + 1;
      }
      return -1;
   }
}

