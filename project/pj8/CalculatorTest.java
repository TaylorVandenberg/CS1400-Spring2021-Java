// Taylor Vandenberg
// CS1400, section 03
// Project 8 - Calculator with Exception Handling
// 5/10/21
import java.util.Scanner;
public class CalculatorTest {
   public static void main(String[] args) throws Exception
   {
      String userInput="";
      System.out.println("Calculator is on.");
      Calculator calc = new Calculator();
      System.out.println("result = "+calc.getResult());
      Scanner kb = new Scanner(System.in);
         userInput=kb.nextLine();
         while(userInput.toLowerCase()!="r")
         {
            try{
               if(userInput.equals(""))
                  System.out.println("Must specify an operation.");
               else if(userInput.toLowerCase().trim().equals("r"))
                  break;
               else
               {
                  calc.doCalculation(userInput);
                  System.out.println("updated result = "+calc.getResult());
               }
               userInput=kb.nextLine();
            }
            catch (UnknownOperatorException e)
            {
               System.out.println(e.getMessage());
               userInput=kb.nextLine();
            }
            catch (Exception e)
            {
               System.out.println("Invalid non-numeric operand");
               userInput=kb.nextLine();
            }
         }
         System.out.println("final result = "+calc.getResult());
      }
   }
