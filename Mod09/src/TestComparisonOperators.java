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
        boolean test1 = 1 == 2;           //先判斷1等不等於2 判斷完指派到test1
        System.out.println("test1 = " + test1);
        
        System.out.println(3.5 > 3);      //true
        System.out.println(true == false);//false
        System.out.println(true != false);//true
//      System.out.println(19!=true);    //編譯失敗 數字型別[ 不林型別不相容(incomparable)
        System.out.println(49 == '1');   //1ㄉ字碼是49 so is true
        System.out.println(3.5 !=3);     //true
    }
}
