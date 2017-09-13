/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A1Q1 {

    public int digitalSum(int n) {
        if (n < 10) {
            return n;
        }else{
            int right = n%10;
            int left = n/10;
            return digitalSum(left)+digitalSum(right);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A1Q1 test = new A1Q1();
    }
}
