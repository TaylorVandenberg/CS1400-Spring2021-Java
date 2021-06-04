import java.util.Scanner;
public class KeyboardInput
{
   public static void main(String[] args)
   {
      int age;
      double annualSalary;
      Scanner kb = new Scanner(System.in);

      System.out.print("enter your name: ");
      String name = kb.nextLine();

      System.out.print("enter your age: ");
      age = kb.nextInt();

      kb.nextLine();

      System.out.print("enter company name: ");
      String company = kb.nextLine();

      System.out.print("enter annual salary: ");
      annualSalary = kb.nextDouble();

      System.out.println("My name is " + name + ", my age is " + age + " and \nI hope to work for " 
                                       + company + " and earn " + annualSalary + " per year.");
   }
}
