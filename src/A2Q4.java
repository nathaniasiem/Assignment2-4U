/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */

public class A2Q4 {
//method for hailstone pattern
    public void hailstone(int n) {
        //create base case
        if (n == 1) {
            System.out.println(n);
        }
        //condition if number is odd number
        else if (n % 2 == 1) {
            n=(3 * n + 1);
            System.out.println(n);
            hailstone(n);
        //condition if number is even number
        } else {
            n=n/2;   
            System.out.println(n);
            hailstone(n);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create variable to test boundaries
        A2Q4 test = new A2Q4();
        System.out.println(5);
        test.hailstone(5);
        System.out.println(12);
        test.hailstone(12);
    }
}
