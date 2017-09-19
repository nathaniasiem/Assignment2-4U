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
        //create base case
        //use later as temporary storage to replace remainders greater than/equal to 10 
        String code = "";
        
        //condition when nth number is 0
        if (n == 0) {
            //output nothing
            return code = "";
        } 
        //create array to hold all numbers and letters
        String [] letter = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
       //replace base case with remainder using letters and numbers from array
        code=letter[n%b];
        //recall method (includes with replacement letters if conditions are met)
        //otherwise positive integer is divided by base
        return convert(n / b, b) + code;
    }

    

    public static void main(String[] args) {
        // TODO code application logic here
        A2Q6 test = new A2Q6();
        String convertTest1 = test.convert(1000, 8);
        System.out.println(convertTest1);
        System.out.println("-----------------");
        String convertTest2 = test.convert(1000, 16);
        System.out.println(convertTest2);
        System.out.println("-----------------");
        String convertTest3 = test.convert(1000,2);
        System.out.println(convertTest3);

    }
}
