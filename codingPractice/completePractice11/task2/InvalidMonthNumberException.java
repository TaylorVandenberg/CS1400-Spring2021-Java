public class InvalidMonthNumberException extends Exception{
   public InvalidMonthNumberException()
      {
         super("Error - Invalid number for the given month: ");
      }
      public InvalidMonthNumberException(int num)
      {
         super("Error - Invalid number for the given month: " + num);
      }
}
