/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestLocalVariable {
//        int age = 20; //attribute, member variable
    public static void main(String[] args) {
        int age = 20, weight = 80; //宣告int型別local variable名稱為 age並指派初值為20
        System.out.println("age = " + age);//soutv[TEB]值為20
        
        String name ;
        System.out.println("age = " +age);//soutv[TEB]
        System.out.println("weight = " + weight);
        age = 25;//指派新的值
        
        System.out.println("his bro's age = "+age);//sout[TEB],25
        
        name = "安安";
        System.out.println(name);
        
    }
    
            
}
