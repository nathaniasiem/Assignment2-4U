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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        recursionExamples test = new recursionExamples();
        int bound1 = test.fibLoop(0);
        System.out.println("0th: " + bound1);
        int bound2 = test.fibLoop(1);
        System.out.println("1st: " + bound2);
        int norm = test.fibLoop(5);
        System.out.println("5th: " + norm);
    }
}
