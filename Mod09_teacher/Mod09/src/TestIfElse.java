import java.util.Calendar;

public class TestIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
//		System.out.println(Calendar.FRIDAY);

		int weekday = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

		if ((weekday == Calendar.SATURDAY) || (weekday == Calendar.SUNDAY)) {
			System.out.println("放假");
		} else if (weekday == Calendar.WEDNESDAY || weekday == Calendar.FRIDAY) {
			System.out.println("上半天");
		} else if (weekday == Calendar.MONDAY || weekday == Calendar.TUESDAY 
				|| weekday == Calendar.THURSDAY) {
			System.out.println("上整天");			
		} else {
			System.out.println("資料有誤");
		}
	}
}
