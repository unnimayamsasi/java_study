package string;

public class Palindrome {
    public static void main(String[] args) {
        String str="malayalam";
        String reversed=new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)){
            System.out.println("it is a palindrome");
        }else{
            System.out.println("it is not palindrome");
        }
    }
}
