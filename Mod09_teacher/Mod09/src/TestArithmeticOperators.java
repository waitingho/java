/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestArithmeticOperators {
    public static void main(String[] args) {
        int i;
        i = 1;
        i = i+1;
        System.out.println("i = " + i); //i = 2
        
        System.out.println(1+2); //3
        System.out.println('1' + '2'); //99
        System.out.println(1 * 2); //2
        System.out.println('1' * '2'); //2450
        System.out.println(1/2D); //0
        System.out.println('1'/(double)'2'); //0.98
        
        byte a=1, b=2;
        byte c = (byte)(a+b);
        System.out.println("c="+c);
        
        int age = 100_0000;
        long ageInSnd = age * 365L * 24 * 60 * 60;
        System.out.println("ageInSnd = " + ageInSnd);
        int k = (2+10)%3;
        System.out.println("k = " + k);
    }
}
