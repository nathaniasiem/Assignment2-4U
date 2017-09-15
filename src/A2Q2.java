/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A2Q2 {
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
            //add both left and right digits
            return digitalSum(left) + digitalSum(right);
        }
    }
    //method to find the root of number and add all digits together

    public int digitalRoot(int n) {
        //condition to 
        if (n < 10) {
            return n;
        } else {
            n = digitalSum(n);

        }
        return digitalRoot(digitalSum(n));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create variable to test boundaries
        A2Q2 test = new A2Q2();
        int digRoot = test.digitalRoot(2019);
        System.out.println(digRoot);
        int digRoot2 = test.digitalRoot(126);
        System.out.println(digRoot2);
        int digRoot3 = test.digitalRoot(49);
        System.out.println(digRoot3);
        int digRoot4 = test.digitalRoot(276);
        System.out.println(digRoot4);

    }
}
