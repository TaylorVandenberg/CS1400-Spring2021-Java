public class PasswordVerifier {
   private static final int MINLENGTH = 6;
   public static void verifyPass(String s1)
   {
      boolean passValid = true;
      if(s1.length()<MINLENGTH)
      {
         System.out.println("- length must be at least 6");
         passValid = false;
      }
      if(s1.equals(s1.toLowerCase()))
      {
         System.out.println("- need at least one uppercase letter");
         passValid = false;
      }
      if(s1.equals(s1.toUpperCase()))
      {
         System.out.println("- need at least one lowercase letter");
         passValid = false;
      }
      if(!verifyNums(s1))
      {
         passValid=false;
         System.out.println("- need at least one digit");
      }
      if(passValid)
      {
         System.out.println("Valid password.");
      }
      else{
         System.out.println("Invalid password.\n");
      }
   }
   public static boolean verifyNums(String s1)
   {
      boolean verified = false;
      for(int i=0; i<s1.length(); i++)
      {
         if(Character.isDigit(s1.charAt(i)))
         {
            verified = true;
         }
      }
      return verified;
   }
}
