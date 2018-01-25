
public class TestFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int j = 10;//i is a local variable
			
			for(int i = 10 ; i > 0 ;i--,j--){ //i is a block variable
				System.out.println(i);
				//System.out.println(j);
			}
			System.out.println("the end:" + j);
	}

}
