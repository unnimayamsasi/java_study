package looping;

public class Factorial {
    public static void main(String[] args) {
        int num=5;
        long factorial=calculateFactprial(num);
        System.out.println("print factorial of "+num+ "is "+factorial);
    }

    public static long calculateFactprial(int n) {

        if(n == 0 ||n ==1) {
            return 1;
        }else{
            return n * calculateFactprial(n - 1);
        }
        }

    }

