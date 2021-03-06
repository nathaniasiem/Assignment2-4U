/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A2Q1 {
    //method to find the digital sum of all the digits within an integer

    public int digitalSum(int n) {
        //condition when n is less than 10
        //return integer
        if (n < 10) {
            return n;
            //condition when greater than 10
        } else {
            //yields the rightmost digit
            int right = n % 10;
            //removes the rightmost digit
            int left = n / 10;
            //add both digits together
            return digitalSum(left) + digitalSum(right);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create variable to test the boundaries
        A2Q1 test = new A2Q1();
        int digSum = test.digitalSum(126);
        System.out.println(digSum);
        int digSum2 = test.digitalSum(49);
        System.out.println(digSum2);
        int digSum3 = test.digitalSum(12);
        System.out.println(digSum3);
        
    }
}
