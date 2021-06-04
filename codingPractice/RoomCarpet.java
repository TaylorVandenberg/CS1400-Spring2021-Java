public class RoomCarpet
{
   private RoomDimension size;
   private double carpetCost;
   public RoomCarpet(RoomDimension d, double cost)
   {
      size = new RoomDimension(d);
      carpetCost = cost;
   }
   public double getTotalCost()
   {
      return size.getArea() * carpetCost;
   }
   public String toString()
   {
      String str = "\nRoom dimesnion:" + size
                   + "\nCarpet cost per square foot: $" + carpetCost
                   +"\nTotal cost: $" + getTotalCost();
      return str;
   }
}
