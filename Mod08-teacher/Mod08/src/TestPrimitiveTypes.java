/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestPrimitiveTypes {

    public static void main(String[] args) {
        //整數類(integral types: byte short int long)
        byte a = 1_0; //10進位, 10
        System.out.println("a = " + a);
        System.out.println("byte:" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);

        short b = 0_10; //8進位, 8
        System.out.println("b = " + b);

        int c = 0b10; //2進位, 2,  -2147483648 to 2147483647
        System.out.println("c = " + c);

        long d = 0xc_AfE; //16進位, 51966, -922,3372,0368,5477,5808 to 922,3372,0368,5477,5807
        System.out.println("d = " + d);

        long price = 30_0000_0000L;

        System.out.println("int:" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
        System.out.println("long:" + Long.MIN_VALUE + "~" + Long.MAX_VALUE);

        //浮點數(Floating Point), IEEE 754
        float e = 1f - .8f;
        System.out.println("e = " + e);
        double f = 1. - .8;
        System.out.println("f = " + f);

        float e1 = 0.1F + 0.1F + 0.1F;
        System.out.println("e1 = " + e1);
        double f1 = 0.1 + .1 + .1;
        System.out.println("f1 = " + f1);

        float e2 = 0.1F;
        System.out.println("e2 = " + e2);
        float e3 = 0.000123456789F;
        System.out.println("e3 = " + e3);

        double f2 = 1D;
        System.out.println("f2 = " + f2);

        double f3 = 1E10;
        double f4 = 0.000123456789;
        System.out.println("f4 = " + f4);

        //文字類:char
        char ch1 = '1';
        System.out.println("ch1 = " + ch1);

        char ch2 = '恆';
        System.out.println("ch2 = " + ch2);

        char ch3 = '堃';
        System.out.println("ch3 = " + ch3);
        
        char ch4 = '\n';
        System.out.println("ch4 = " + ch4);
        
        char ch5 = '\t';
        System.out.println("ch5 = " + ch5);
        
        char ch6 = '\u03a6'; //Φ
        System.out.println("ch6 = " + ch6);
        
        //邏輯類: boolean
        boolean b1 = true;
        boolean b2 = false;
//        int b3 = true; //compile-time error
//        boolean b4 = "true"; //compile-time error
        
    }
}
