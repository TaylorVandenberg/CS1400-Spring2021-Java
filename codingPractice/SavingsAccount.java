public class SavingsAccount
{
   private double balance;
   private double annualInterestRate;

   public void SavingsAccount(double bal, double rate)
   {
      balance = bal;
      annualInterestRate = rate;
   }

   public double getBalance()
   {
      return balance;
   }

   public double getInterestRate()
   {
      return annualInterestRate;
   }

   public void deposit(double amount)
   {
      balance = (balance + amount);
   }

   public void withdraw(double amount)
   {
      balance = (balance - amount);
   }

   public double addInterest()
   {
      double monthlyInterest = (annualInterestRate/12)*balance;
      balance = balance + (balance*monthlyInterest);
      return monthlyInterest;
   }
}
