// Taylor Vandenberg
// CS1400, section 03
// Project 2 - Income Tax program
// Feb 20 2021

import java.util.Scanner;
public class Tax
{
   public static void main(String[] args)
   {
      String single;
      String married;
      double taxable_Income;
      double result_Tax;
      final double BASE_TAX1_SINGLE = 800;
      final double BASE_TAX2_SINGLE = 4400;
      final double BASE_TAX1_MARRIED = 1600;
      final double BASE_TAX2_MARRIED = 8800;
      final double TAX_RATE1 = 0.1;
      final double TAX_RATE2 = 0.15;
      final double TAX_RATE3 = 0.25;
      Scanner kb = new Scanner(System.in);

      System.out.println("Enter your martial status"
         + " (single or married):");

      String status = kb.nextLine();

      // INVALID MARTIAL STATUS
      if (!status.equalsIgnoreCase("single") &&
         !status.equalsIgnoreCase("married"))
      {
         System.out.println("-- illegal martial status --");
         System.exit(0);
      }

      // SINGLE
      else if (status.equalsIgnoreCase("single"))
      {
      System.out.println("Enter your taxable income:");
      taxable_Income = kb.nextDouble();
      
      if (taxable_Income < 0)
         {
         System.out.println("-- illegal income --");
         }

      // FIRST BRACKET
      else if (taxable_Income <= 8000)
         {
         result_Tax = taxable_Income * TAX_RATE1;
         System.out.printf("Your income tax is $%,.2f\n",
                          result_Tax);

      }
      // SECOND BRACKET
      else if ((taxable_Income > 8000) && 
              (taxable_Income <= 32000))
         {
         result_Tax = (taxable_Income - 8000)
                    * TAX_RATE2 + BASE_TAX1_SINGLE;
         System.out.printf("Your income tax is $%,.2f\n",
                          result_Tax);
         }
      // THIRD BRACKET
      else if (taxable_Income > 32000)
         {
         result_Tax = (taxable_Income - 32000)
                    * TAX_RATE3 + BASE_TAX2_SINGLE;
         System.out.printf("Your income tax is $%,.2f\n",
                          result_Tax);
         } 
      }
      //MARRIED
      else if (status.equalsIgnoreCase("married"))
      {
      System.out.println("Enter your taxable income:");
      taxable_Income = kb.nextDouble();

      if (taxable_Income < 0)
         {
         System.out.println("-- illegal income --");
         }

      // FIRST BRACKET
      else if (taxable_Income <= 16000)
         {
         result_Tax = taxable_Income * TAX_RATE1;
         System.out.printf("Your income tax is $%,.2f\n",
                          result_Tax);

      }
      // SECOND BRACKET
      else if ((taxable_Income > 16000) &&
              (taxable_Income <= 64000))
         {
         result_Tax = (taxable_Income - 16000)
                    * TAX_RATE2 + BASE_TAX1_MARRIED;
         System.out.printf("Your income tax is $%,.2f\n",
                          result_Tax);
         }
      // THIRD BRACKET
      else if (taxable_Income > 64000)
         {
         result_Tax = (taxable_Income - 64000)
                    * TAX_RATE3 + BASE_TAX2_MARRIED;
         System.out.printf("Your income tax is $%,.2f\n",
                          result_Tax);
         }
      }

   }
}
