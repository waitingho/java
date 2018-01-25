/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestIncDecOperator {
    public static void main(String[] args) {
        int a = 1;
        
        
        System.out.println(a++);//先print a, 在 a = a+1
        System.out.println(++a);//a = a+1, print 3
        System.out.println(a--);//print 3, a=a-1
        System.out.println(--a);//a=a-1, print1
        
        byte b = 127;
        System.out.println(b++);//print 127, b=b+1:-128
        System.out.println(++b);//b= -128,   b=b+1:-127
        System.out.println(b--);//print -127,b=b-1:-128
        System.out.println(--b);//b= -128 ,  b=b-1: 127
        
        char c = 65535;
        //System.out.println(c);
        System.out.println("c:"+ (int)c++);//65535
        System.out.println("c:"+ (int)++c);//1
        
        
    }
    
}
