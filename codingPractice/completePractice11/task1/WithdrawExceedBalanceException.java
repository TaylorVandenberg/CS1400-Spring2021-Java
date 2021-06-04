public class WithdrawExceedBalanceException extends Exception{
   public WithdrawExceedBalanceException()
   {
      super("Error: Withdraw exceeds balance");
   }
   public WithdrawExceedBalanceException(double amount)
   {
      super("Error: Withdraw exceeds balance: " + amount);
   }
}
