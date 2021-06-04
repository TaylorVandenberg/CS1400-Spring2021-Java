public class PhoneBookEntry {
   private String name;
   private String number;
   public PhoneBookEntry(String userName, String userNum)
   {
	   name = userName;
	   number = userNum;
   }
   public String toString()
   {
	   return "(" + name + ", " + number + ")";
   }
}
