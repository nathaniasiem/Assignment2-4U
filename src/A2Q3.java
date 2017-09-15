/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A2Q3 {

    public int triangle(int n) {
        //base case
        //condition when nth number equals to 0, output equals 0
        if(n==0){
            return n=0;
        //condition when nth number equals to 1,output equals 1
        }else if (n==1){
            return n=1;
    }
        //output the nth number plus the previous output number
        return n+ triangle (n-1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create variable to test boundaries
        A2Q3 test = new A2Q3();
        int triangle0 = test.triangle(0);
        System.out.println(triangle0);
        int triangle1 = test.triangle(1);
        System.out.println(triangle1);
        int triangle2 = test.triangle(2);
        System.out.println(triangle2);
        int triangle3 = test.triangle(3);
        System.out.println(triangle3);
        int triangle4 = test.triangle(4);
        System.out.println(triangle4);
        
    }
}
