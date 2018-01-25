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
//        int age = 20;  //attribute, member variable
    public static void main(String[] args) {
        int age = 20;//宣告int型別local variable名稱為age，並指派初值20       
        int stock=5, quantity = 5; //宣告兩個int型別的區域變數，分別是stock初值為5，quantity初值為5
        
        System.out.println("stock = " + stock);
        System.out.println("quantity = " + quantity);
        
        String name; //宣告String型別local variable名稱為name
        System.out.println("age = " + age);        
        
        age = 25; //將age的值指派為25
        System.out.println("年齡為" + age); //25

        name = "張三豐";
        System.out.println(name);
    }    
}