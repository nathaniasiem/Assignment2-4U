/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A2Q4 {

    public int hailstone(int n) {
        //create base case
        if (n == 1) {
            return n;
        }
        if (n % 2 == 1) {
            n=(3 * n + 1);
            return hailstone(n);
        } else {
            n=n/2;   
        }return hailstone(n);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create variable to test boundaries
        A2Q4 test = new A2Q4();
        int hStone1 = test.hailstone(5);
        System.out.println(hStone1);
        int hStone2 = test.hailstone(12);
        System.out.println(hStone2);

    }
}
