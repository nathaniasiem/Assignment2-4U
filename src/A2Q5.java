/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A2Q5 {
    //method to output nth number as binary digits
public void binaryConvert (int n){
    //condition when number is greater than 0
    if (n>0){
        //take the nth number divide by 2
        binaryConvert(n/2);
        //output as binary digits
        System.out.print(n%2);
    
    }
}
    public static void main(String[] args) {
        // create a variable to test boundaries
        A2Q5 test = new A2Q5();
        System.out.println(156);
        test.binaryConvert(156);
    }
}
