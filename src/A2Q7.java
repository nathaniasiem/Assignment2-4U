/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A2Q7 {

    public boolean isPalindrome(String s, int length) {
        //create a base case which will return true if condition matches
        if (length <=1) {
            return true;
        }
        //set the first letter as a string
       String frstLetter =s.substring(0,1);
       //set the last letter as a string
       String lstLetter = s.substring(length-1);
       
       if(frstLetter.equals(lstLetter)){
           return isPalindrome(s.substring(1,length-1),length-2);
       }else{
           return false;
       }
       
           
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create variable to test boundaries
        A2Q7 test = new A2Q7();
        System.out.println(test.isPalindrome("racecar", 7));
        System.out.println(test.isPalindrome("radar",5));
        System.out.println(test.isPalindrome("Nathania",8));
    }
}
