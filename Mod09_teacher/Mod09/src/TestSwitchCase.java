import java.util.Calendar;

public class TestSwitchCase {
	public static void main(String[] args) {
		int weekday = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		
		switch(weekday) {
			case Calendar.SATURDAY:
			case Calendar.SUNDAY:
				System.out.println("放假");
				break;
			case Calendar.WEDNESDAY:
			case Calendar.FRIDAY:
				System.out.println("上半天");
				break;
			case Calendar.MONDAY:
			case Calendar.TUESDAY:
			case Calendar.THURSDAY:
				System.out.println("上整天");
				break;
			default:
				System.out.println("資料有誤");
				break;
		}
		
		String weekDay = "SUNDAY";
		switch(weekDay) {
			case "SATURDAY":
			case "SUNDAY":
				System.out.println("放假");
				break;
			case "WEDNESDAY":
			case "FRIDAY":
				System.out.println("上半天");
				break;
			case "MONDAY":
			case "TUESDAY":
			case "THURSDAY":
				System.out.println("上整天");
				break;
			default:
				System.out.println("資料有誤");
				break;
		}
		
	}
}
