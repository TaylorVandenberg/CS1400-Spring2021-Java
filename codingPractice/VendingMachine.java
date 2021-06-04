import java.util.Scanner;
public class VendingMachine
{
   public static void main(String[] args)
   {
      int price, total;
      int quarter, dime, nickle;
      Scanner kb = new Scanner(System.in);

      System.out.print("Enter price of item from 25 cents to a dollar, in 5-cent increments\n");
      
      price = kb.nextInt();
   
      total = price;

      quarter = (price / 25);
      price = (price - (25 * quarter));

      dime = (price / 10);
      price = (price - (10 * dime));

      nickle = (price / 5);

      System.out.println("You bought an item for " + total
                        + " cents and gave me a dollar, so your change is\n" 
                        + quarter + " quarters,\n" + dime + " dimes, and\n" 
                        + nickle + " nickles.\n");

   }
}
