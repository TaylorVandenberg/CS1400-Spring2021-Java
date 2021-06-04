public class HotDogStand
{
   private int id;
   private int numSold;
   private static int totalSold = 0;
   public HotDogStand(int newID, int newNumSold)
   {
      id = newID;
      numSold = newNumSold;
      totalSold += newNumSold;
   }
   public void justSold()
   {
      numSold++;
      totalSold++;
   }
   public String toString()
   {
      return String.format("Stand %d sold %d hot dogs.\n", id, numSold);
   }
   public static int getTotalSold()
   {
      return totalSold;
   }
}
