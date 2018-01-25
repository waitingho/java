/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heweiting
 */
public class NewClass {
    public static void main(String[] args) {
                int i;
	        int j;
	        for( i=1;i<=4;i++)
	        {
	            for( j=0;j<4-i;j++)
                        System.out.print(" ");
	            for( j=0;j<=2*i-2;j++)
                        System.out.print("*");
                        System.out.println();
	 
	        }
	            for(i=4;i>=1;i--)
	            {
	                for( j=0;j<=4-i;j++)
                            System.out.print(" ");
	                for(j=1;j<=2*i-3;j++)
                            System.out.print("*");
                            System.out.println("");
	            }
    }
}
