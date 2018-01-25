
public class Test99Table {
	public static void main(String[] args) {
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(i+"*"+j+"=" + i*j );
				if(j<9) {
					System.out.print(",\t");
				}
			}
			System.out.println();
		}
		
		/* //以下示範無窮迴圈
		for(;;) {
			System.out.println("Test");
		}
		System.out.println("The End"); //在無窮迴圈之後的此行程式會編譯失敗，unreachable code
		*/
	}
}
