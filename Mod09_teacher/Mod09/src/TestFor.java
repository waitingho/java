
public class TestFor {
	public static void main(String[] args) {
		int j=10, k=10;		//j is a local variable
		for(int i=1;i<10;i++) {//i is a block variable
			System.out.println(i);
		}
		
		
		for(int i=10;i>0;i--,j--,System.out.println(k--)) { //i is a block variable
			System.out.println(i);
		}
		
		System.out.println("The End, j:" + j);
		
	}
}
