public class NegativeDepositException extends Exception{
      public NegativeDepositException()
      {
         super("Error: Negative deposit");
      }
      public NegativeDepositException(double amount)
      {
         super("Error: Negative deposit: " + amount);
      }
}
