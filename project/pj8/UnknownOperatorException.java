// Taylor Vandenberg
// CS1400, section 03
// Project 8 - Calculator with Exception Handling
// 5/10/21
public class UnknownOperatorException extends Exception {
   public UnknownOperatorException()
   {
      super("Must specify an operation.");
   }
   public UnknownOperatorException(char str)
   {
      super(str+" is an unknown opertion.");
   }
}
