public class Car
{
   private int yearModel;
   private int speed;
   private String make; 

   public void constructor()
   {
      speed = 0;
   }

   public void setYear(int year)
   {
      yearModel = year;
   }

   public void setMake(String carMake)
   {
      make = carMake;
   }

   public void setSpeed(int carSpeed)
   {
      speed = carSpeed;
   }

   public int getYear()
   {
      return yearModel;
   }

   public int getSpeed()
   {
      return speed;
   }

   public String getMake()
   {
      return make;
   }

   public void accelerate()
   {
      speed = (speed + 5);
   }  

   public void brake()
   {
      speed = (speed - 5);
   }
}
