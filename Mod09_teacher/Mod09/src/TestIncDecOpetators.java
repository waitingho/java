/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestIncDecOpetators {

    public static void main(String[] args) {
        int a = 1;
        System.out.println(a++); // print a:1, a=a+1        
        System.out.println(++a); // a=a+1, print a:3
        System.out.println(a--); // print a:3, a=a-1        
        System.out.println(--a); // a=a-1, print a:1
        
        
        byte b = 127;
        System.out.println("b:"+ b++);//127
        System.out.println("b:"+ ++b);//-127
        System.out.println("b:"+ b--);//print:-127, a:-128
        System.out.println("b:"+ --b);//a=a-1, print: 127
        
        System.out.println(Integer.toBinaryString(-1));        
        
        char c = 65535;
        System.out.println("c:"+ (int)c++);//65535
        System.out.println("c:"+ (int)++c);//1
        
        
    }
}
