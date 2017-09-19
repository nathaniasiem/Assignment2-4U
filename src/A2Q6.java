/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A2Q6 {

    public String convert(int n, int b) {
        
        //condition when nth number is 0
        if (n == 0) {
            //output nothing
            return "";
            //condition when nth number is not 0
        } else {
            //convert the number by dividing the nth number with base and adding the remainder
            return convert(n / b, b) + (n % b);   
        }

    }
    public static void main(String[] args) {
        // TODO code application logic here
        A2Q6 test = new A2Q6();
        String convertTest=test.convert(1000, 16);
        System.out.println(convertTest);
        
    }
}

