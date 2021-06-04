//Taylor Vandenberg
//CS1400, section 03
//Project 7 - Employee Inheritance
//5-3-21
public class WorkerTest {
   public static void main(String args[])
   {
      ProductionWorker w1 = new ProductionWorker("John Smith", "123-A", "11-15-2005", 1, 23.50);
      ProductionWorker w2 = new ProductionWorker();
      w2.setEmployee("Joan Jones");
      w2.setEmployeeNum("222-L");
      w2.setHireDate("12-12-2018");
      w2.setShift(2);
      w2.setHourlyRate(18.50);
      ProductionWorker w3 = new ProductionWorker("Tony Gaddis", "Joe Momma", "1-23-2006", 420, 19.50);

   System.out.println("Here's the first production worker.");
   System.out.println(w1);
   System.out.println("\nHere's the second production worker.");
   System.out.println(w2);
   System.out.println("\nHere's the third production worker.");
   System.out.println(w3);
   }
}
