
public class Test99Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<10;i++) {
			for(int j = 1;j<10;j++) {
			System.out.print(i+"*"+j+"="+i*j);
			if(j<9) {
				System.out.print(",\t");
			}
			}
			System.out.println();
		}
		/*// 以下示範無窮迴圈
		for(;;) {
			System.out.println("Test");
		}
		System.out.println("the end");//在無窮迴圈之後ㄉ城市會編譯失敗,unreachable code
		*/
	}

}
