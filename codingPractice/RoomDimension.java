public class RoomDimension
{
   private double length;
   private double width;
   public RoomDimension(double l, double w)
   {
      length = l;
      width = w;
   }
   public RoomDimension(RoomDimension obj2)
   {
      this.length = obj2.length;
      this.width = obj2.width;
   }
   public double getArea()
   {
      return length*width;
   }
   public String toString()
   {
      return String.format("\nLength = %.1f\nWidth = %.1f", length, width);
   }
}
