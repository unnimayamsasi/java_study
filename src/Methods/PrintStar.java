package Methods;

public class PrintStar {
    public static void main(String[] args) {
        int n=10;
       printStar(n);
    }
    public static void  printStar(int n){
        String star="* ".repeat(n);
        System.out.println(star);
    }
}
