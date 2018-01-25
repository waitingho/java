/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestArithmetic {
    public static void main(String[] args) {
        int i;
        i = 1;
        i = i+1;
        System.out.println("i = " + i);//i=2
        System.out.println(1 + 2);//3
        System.out.println('1' + '2');//99,aㄉ字碼是49 bㄉ字碼是50
        System.out.println(1 * 2);//2
        System.out.println(1 / 2);//0
        System.out.println(1 / 2f);//最大型別是float, SO answer = 0.5
        
        
        byte a=1,b=2;
        byte c = (byte)(a+b);
        System.out.println("c = " + c);
        
        int age = 100_0000;
        long ageInSnd = age * 365L * 24 * 60 * 60 ;
        System.out.println("ageInSnd = "+ ageInSnd);
        
        int k =(2+10)%3;
        System.out.println("k = " + k);
    }
}
