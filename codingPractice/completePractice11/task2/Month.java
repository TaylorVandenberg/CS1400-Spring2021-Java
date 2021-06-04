public class Month {
   private int monthNum;
   public Month(int m) throws InvalidMonthNumberException
   {
      if (m<1 || m>12)
         throw new InvalidMonthNumberException(m);
      monthNum=m;
   }
   public Month(String name) throws InvalidMonthNameException
   {
      name=name.toLowerCase();
      String[] monthName={"january", "february", "march", "april", "may", "june",
                          "july", "august", "september", "october", "november", "december"};
      for(int i=0; i<monthName.length; i++)
      {
         if(monthName[i].equals(name))
         {
            monthNum=i+1;
            return;
         }
      }
      throw new InvalidMonthNameException(name);
   }
   public String toString()
   {
      String[] monthName={"January", "February", "March", "April", "May", "June",
                          "July", "August", "September", "October", "November", "December"};
      return "The month you just created is "+ monthName[monthNum-1];
   }
}
