/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class recursionExamples {
    // returns the nth Fibbonacci number
    //n - the nth number we want in the sequence

    public int fibLoop(int n) {
        //array to store sequence
        int[] numbers = new int[n + 1];
        numbers[0] = 1;
        if (n > 0) {
            numbers[1] = 1;
        }
        //building the sequence
        for (int i = 2; i < n + 1; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers[n];

    }
    //Calculate the nth Fib number using recursion
    // n - the nth number in the sequence

    public int fibR(int n) {
        //BASE CASE
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibR(n - 1) + fibR(n - 2);
        }
    }

    public int gcd(int a, int b) {

        //swap if a is a lower number
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        //check if we are done
        if (b == 0) {
            return a;
        } else {
            //find new values for a and b
            int r = a % b;
            //calculate new gcd
            return gcd(b, r);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        recursionExamples test = new recursionExamples();
        int bound1 = test.fibLoop(0);
        System.out.println("0th: " + bound1);
        int bound2 = test.fibLoop(1);
        System.out.println("1st: " + bound2);
        int norm = test.fibLoop(26);
        System.out.println("26th: " + norm);
        System.out.println("--------------");
        int boundR1 = test.fibR(0);
        System.out.println("0th:" + boundR1);
        int boundR2 = test.fibR(1);
        System.out.println("1st:" + boundR2);
        int normR = test.fibR(6);
        System.out.println("6th:" + normR);


        System.out.println("------- GCD Test");
        System.out.println("GCD (1377,24)");
        int gcd = test.gcd(1377, 24);
        System.out.println(gcd);

    }
}
