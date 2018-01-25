import java.util.Scanner;

public class TestOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number, PLZ");
		int data = new Scanner(System.in).nextInt();
		
		if(data%2 == 0) {
			System.out.println("Ur number:" +data + " is Odd");
		}
		else {
			System.out.println("Ur number:" +data + " is Even");
		}
			
		
		
		//System.out.println("Ur number is:" +data);
	}

}
