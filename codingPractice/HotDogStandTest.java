public class HotDogStandTest
{
   public static void main(String[] args)
   {
      System.out.println("Test our code with 3 hot dog stands created,");
      System.out.println("each sells a variety of hot dogs: ");
      HotDogStand s1 = new HotDogStand(1, 0);
      HotDogStand s2 = new HotDogStand(2, 0);
      HotDogStand s3 = new HotDogStand(3, 33);
      System.out.print(s1);
      System.out.print(s2);
      System.out.print(s3);
      System.out.printf("Total sold = %d\n", HotDogStand.getTotalSold());

      System.out.println("\nSold at stand 1, 2, 1, 1, 2: ");
      s1.justSold();
      s2.justSold();
      s1.justSold();
      s1.justSold();
      s2.justSold();
      System.out.print(s1);
      System.out.print(s2);
      System.out.print(s3);
      System.out.printf("Total sold = %d\n", HotDogStand.getTotalSold());

      System.out.println("\nSold at stand 3, 3, 2, 1, 1: ");
      s3.justSold();
      s3.justSold();
      s2.justSold();
      s1.justSold();
      s1.justSold();
      System.out.print(s1);
      System.out.print(s2);
      System.out.print(s3);
      System.out.printf("Total sold = %d\n", HotDogStand.getTotalSold());
   }
}
