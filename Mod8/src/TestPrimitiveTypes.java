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
        byte  a = 10;//10進位,10,For byte, from -128 to 127, inclusive
        System.out.println(a);
        
        short b = 010;//8進位,8,For short, from -32768 to 32767, inclusive
        System.out.println(b);
        
        int   c = 0b10;//2進位,2,
        System.out.println(c);
        System.out.println("int:" +Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
        //For int, from -2147483648 to 2147483647, inclusive
        
        long  d =0xcafe;
        //16進位,51966,For long, from -9223372036854775808 to 9223372036854775807, inclusive
        System.out.println( "d = " + d );
        
        long price = 3000_000_000L;//要加L 不然再int就爆掉惹
        
        //浮點數, IEEE754
        float e = 1.0f -0.8f;
        double f = 1.0-0.8;
        System.out.println("e = " + e);
        System.out.println("f =" + f);
        
        float e1 = 0.1f+0.1f+0.1f;
        double f1 = 0.1+0.1+0.1;
        System.out.println("e1 = " + e1);
        System.out.println("f1 =" + f1);
        
        double f2 = 1E10;
        double f3 = 0.0000000000000066666666664646;
        System.out.println("f2 ="+f2);
        System.out.println("f3 = "+f3);
        
        //文字類: char
        char ch1 = '１';
        System.out.println("ch1 = " + ch1);
        
        char ch2 = '橫';
        System.out.println("ch2 = " + ch2);
        
        char ch3 = '\n';//換行用
        System.out.println("ch3 = "+ch3);
        
        char ch4 = '\u03a6';
        System.out.println("ch4 = " + ch4);// Φ
        
        //邏輯類:boolean 布林行別不行指派給別ㄉ型別 別ㄉ型別也無法指定給布林
        boolean b1 = true;
        boolean b2 = false;
    }
    
}
