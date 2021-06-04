public class TwoDarrayTest
{
   public static void main(String[] args)
   {
      int total, row0, row1, col0, col2, highestRow0;
      int highestRow1, lowestCol0, lowestCol1;
      double avg;
      int[][] array1 = { {2, 1, 9}, {7, 3, 4} };
      System.out.println("Processing the int array");
      total = TwoDarray.getTotal(array1);
      avg=TwoDarray.getAverage(array1);
      row0=TwoDarray.getRowTotal(array1, 0);
      row1=TwoDarray.getRowTotal(array1, 1);
      col0=TwoDarray.getColumnTotal(array1, 0);
      col2=TwoDarray.getColumnTotal(array1, 2);
      highestRow0=TwoDarray.getHighestInRow(array1, 0);
      highestRow1=TwoDarray.getHighestInRow(array1, 1);
      lowestCol0=TwoDarray.getLowestInColumn(array1, 0);
      lowestCol1=TwoDarray.getLowestInColumn(array1, 1);
      
      System.out.println("Processing the int array.");
      System.out.println("Total: "+total);
      System.out.println("Average: "+avg);
      System.out.println("Total of row 0: "+row0);
      System.out.println("Total of row 1: "+row1);
      System.out.println("Total of col 0: "+col0);
      System.out.println("Total of col 2: "+col2);
      System.out.println("Highest in row 0: "+highestRow0);
      System.out.println("Highest in row 1: "+highestRow1);
      System.out.println("Lowest in col 0: "+lowestCol0);
      System.out.println("Lowest in col 1: "+lowestCol1);
   }
}
