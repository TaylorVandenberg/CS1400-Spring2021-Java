public class InvalidMonthNameException extends Exception{
   public InvalidMonthNameException()
      {
         super("Error - Invalid name for the given month: ");
      }
      public InvalidMonthNameException(String str)
      {
         super("Error - Invalid name for the given month: " + str);
      }
}
