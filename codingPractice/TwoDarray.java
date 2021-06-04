public class TwoDarray {
	public static int getTotal (int[][] a)
    {
	   int sum=0;
	   for (int row = 0; row < a.length; row++)
	   {
	      for (int col = 0; col < a[row].length; col++)
	         sum += a[row][col];
	   }
	      return sum;
   }
   public static double getAverage(int[][] a)
   {
	   double sum=0;
	   double total=0;
	   for (int row = 0; row < a.length; row++)
	   {
	      for (int col = 0; col < a[row].length; col++)
              {
	         sum += a[row][col];
                 total++;
              }
            }
	      double avg = sum/total;
	      return avg;
   }
   public static int getRowTotal(int[][] a, int row)
   {
      int total=0;
	  for (int col = 0; col < a[row].length; col++)
	  {
	     total += a[row][col];
	  }
      return total; 
   }
   public static int getColumnTotal(int[][] a, int col)
   {
	  int total=0;
      for (int row = 0; row < a.length; row++)
         {
    	    total += a[row][col];
         }
	  return total;
   }
   public static int getHighestInRow(int[][] a, int row)
   {
	   int highest=a[row][0];
	   for (int col=0; col < a[row].length; col++)
	   {
		   if(a[row][col]>highest)
		   {
			   highest = a[row][col];
		   }
	   }
	   return highest;
   }
   public static int getLowestInColumn(int[][] a, int col)
   {
	   int lowest = a[0][col];
	   for (int row=0; row<a.length-1; row++)
	   {
		   if(a[row][col]<lowest)
			   lowest = a[row][col];
	   }
	   return lowest;
   }
}
