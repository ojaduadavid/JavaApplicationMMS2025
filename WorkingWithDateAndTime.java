import java.time.LocalDate;
import java.time.LocalTime;

public class WorkingWithDateAndTime{
	public static void main(String[] args){
		
		LocalDate currentDate = LocalDate.now();
		LocalDate myDate = LocalDate.of(2014,5,17);
		LocalDate resumptionDate = LocalDate.parse("2026-06-17");
		
		System.out.printf("working with date");
		System.out.printf("Today's Date is %s%n",currentDate);
		System.out.printf("The wedding date is %s%n",myDate);
		System.out.printf("The resumption date is %s%n",resumptionDate);
		System.out.printf("The year is %s%n",currentDate.getYear());
		System.out.printf("The Month is %s%n",currentDate.getMonth());
		System.out.printf("The Day is %s%n",currentDate.getDayOfMonth());
		System.out.printf("My Exams will be on the %s%n",currentDate.plusDays(7));
		System.out.printf("The year is %s%n",currentDate.plusYears(2));
		System.out.printf("The Month is %s%n",currentDate.plusMonths(2));
		System.out.printf("The Day is %s%n",currentDate.plusDays(2));
		
		
	}
}