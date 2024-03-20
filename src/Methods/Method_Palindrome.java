package Methods;

import javax.swing.*;

public class Method_Palindrome {
    public static void main(String[] args) {
       String str ="radar";
        boolean isPalindrome=checkPalindrome(str);
        if(isPalindrome) {
            System.out.println("it is palindrome");
        } else{

        System.out.println("it not palindrome");
    }
}
public static boolean checkPalindrome(String str){
        String reversed=new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
}
}
