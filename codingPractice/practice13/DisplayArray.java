public class DisplayArray {
   static int count=0;
   public static void printArray(int[] x)
   {
      System.out.print(x[count]+" ");
      if(x.length > count+1)
      {
         count+=1;
         printArray(x);
      }
   }
   public static void main(String [] args)
   {
      int[] a1 = {1,3,5,7,9};
      printArray(a1);
      System.out.println("");
   }
}
