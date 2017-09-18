/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A2Q5 {
public void binaryConvert (int n){
    //create base case
    if (n==1){
        binaryConvert(n);
    }else if(n%2==0){
        n=n/2;
        System.out.print(0);
        binaryConvert(n);
    }else{
        System.out.print(1);
    }
}
    public static void main(String[] args) {
        // create a variable to test boundaries
        A2Q5 test = new A2Q5();
        System.out.println(156);
        test.binaryConvert(156);
    }
}
