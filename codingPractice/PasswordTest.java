import java.util.Scanner;
public class PasswordTest {
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter a password: ");
      String str = kb.nextLine();
      PasswordVerifier.verifyPass(str);
   }
}
