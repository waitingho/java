/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestLogicalOperators {

    public static void main(String[] args) {
        boolean test1 = !true;
        System.out.println("test1 = " + test1);

        System.out.println(true & true); //true
        System.out.println(true & false); //false
        System.out.println(false & true); //false
        System.out.println(false & false); //false

        System.out.println(true | true); //true
        System.out.println(true | false); //true
        System.out.println(false | true); //true
        System.out.println(false | false); //false

        System.out.println(true ^ true); //false
        System.out.println(true ^ false); //true
        System.out.println(false ^ true); //true
        System.out.println(false ^ false); //false

        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false

        System.out.println(true || true); //true
        System.out.println(true || false); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false     

//        System.out.println(true ^^ true); //false
//        System.out.println(true ^^ false); //true
//        System.out.println(false ^^ true); //true
//        System.out.println(false ^^ false); //false        

        String password = null;//"12345";
        //檢查密碼是對的(6~20):
        System.out.println(
                password != null &&
                password.length() >= 6 && password.length() <= 20); //false

        //檢查密碼是否錯誤(6~20):
        System.out.println(
                password == null ||
                password.length() < 6 || password.length() > 20); //true

    }
}
