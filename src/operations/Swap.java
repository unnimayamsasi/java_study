package operations;

public class Swap {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println("swap two numbers:");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("print a="+a);
        System.out.println("print b="+b);
    }
}
