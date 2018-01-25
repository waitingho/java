/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestComparisonOperators {
    public static void main(String[] args) {
        boolean test1 = 1 == '2';
        System.out.println("test1 = " + test1);//false
        
        System.out.println(3.5 > 3L); //true
        System.out.println(3.5 >= 3L); //true
        System.out.println(3.5 < 3L); //false
        System.out.println(3.5 <= 3L); //false
        
        System.out.println(true == false); //false
        System.out.println(true != false); //true
//        System.out.println(49 != true); //編譯失敗，數字型別與boolean型別不相容(incomparable)
        System.out.println(49 == '1'); //true
        System.out.println(3.5 != 3); //true
        
    }
}
