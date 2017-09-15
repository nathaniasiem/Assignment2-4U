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
        if(n<=0){
            return n;
            
        }else{
            return triangle(n-1)+triangle();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A2Q3 test = new A2Q3();
        int triangle0 = test.triangle(0);
        System.out.println(triangle0);
        int triangle1 = test.triangle(1);
        System.out.println(triangle1);
        int triangle2 = test.triangle(2);
        System.out.println(triangle2);
        int triangle3 = test.triangle(3);
        System.out.println(triangle3);
        
    }
}
