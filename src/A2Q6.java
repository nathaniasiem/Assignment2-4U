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
        //use later to replace remainders greater than/equal to 10 
        String word = "";


        //condition when nth number is 0
        if (n == 0) {
            //output nothing
            return word = "";
            //condition when nth number is not 0
        } else if (n > 0) {
            //convert the number by dividing the nth number with base and adding the remainder
            return convert(n / b, b) + (n % b);
        } else if (n % b == 10) {
            word = "A";
        } else if (n % b == 11) {
            word = "B";

       } else if (n % b == 12) {            
           word = "C";

        }else if(n % b==13){
            word="D";
        }else if(n % b==14){
            word="E";
        }else if(n % b==15){
            word="F";
        }
        return convert(n / b, b) + (n % b) + word;
    }

    

    public static void main(String[] args) {
        // TODO code application logic here
        A2Q6 test = new A2Q6();
        String convertTest = test.convert(1000, 16);
        System.out.println(convertTest);

    }
}
