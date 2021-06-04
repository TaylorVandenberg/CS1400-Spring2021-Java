import java.util.Scanner;
public class SavingsAccountTest
{
   public static void main(String[] args)
   {
      SavingsAccount userBank = new SavingsAccount();
      double annualInterestRate;
      double monthlyDeposit;
      double accountAge;
      double monthlyWithdraw;
      double depositTotal = 0;
      double withdrawTotal = 0;
      Scanner kb = new Scanner (System.in);

      System.out.print("Enter the savings account's starting balance: ");
      double bal = kb.nextDouble();

      System.out.print("Enter the savings account's annual interest rate: ");
      double rate = kb.nextDouble();

      userBank.SavingsAccount(bal,rate);

      System.out.print("How many months have passed since the account was opened? ");
      accountAge = kb.nextDouble();

      for(int i=0, j=accountAge; i<=j; i++)
      {
         System.out.print("Enter the amount deposited during month " + i);
         monthlyDeposit = kb.nextDouble();
         depositTotal = (depostitTotal + monthlyDeposit);
         System.out.print("Enter the amount withdrawn during month " + i);
         monthlyWithdraw = kb.nextDouble();
         withdrawTotal = (withdrawTotal + monthlyWithdraw);
         userBank.addInterest();
      }
      System.out.println("Total deposited: " + depositTotal);
      System.out.println("Total withdrawn: " + withdrawTotal);
      System.out.println("Total interest earned; " + userBank.getInterestRate());
      System.out.println("Ending balance " + userBank.getBalance());
   }
}
