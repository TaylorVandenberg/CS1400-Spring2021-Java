import java.util.Scanner;
public class CarpetCalculator
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("enter the length of the room: ");
      double length = kb.nextDouble();
      System.out.print("enter the width of the room: ");
      double width = kb.nextDouble();
      System.out.print("enter the cost per square foot: ");
      double carpetPrice = kb.nextDouble();

      RoomDimension d = new RoomDimension(length, width);
      RoomCarpet room = new RoomCarpet(d, carpetPrice);
      System.out.println(room);
   }
}
