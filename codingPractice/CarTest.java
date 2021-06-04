public class CarTest
{
   public static void main(String[] args)
   {
      Car userCar = new Car();

      userCar.setYear(2018);
      userCar.setMake("Porsche");
 
      System.out.println("Current status of the car:");
      System.out.println("Year model: " + userCar.getMake());
      System.out.println("Make: " + userCar.getMake());
      System.out.println("Speed: " + userCar.getSpeed());

      System.out.println("\nAccelerating...");
      userCar.accelerate();
      userCar.accelerate();
      userCar.accelerate();
      userCar.accelerate();
      userCar.accelerate();

      System.out.println("Now the speed is " + userCar.getSpeed());

      System.out.println("\nBraking...");
      userCar.brake();
      userCar.brake();
      userCar.brake();
      userCar.brake();
      userCar.brake();

      System.out.println("Now the speed is " + userCar.getSpeed());
   }
}
