package Methods;

public class Method_Factorial {
    public static void main(String[] args) {
        int num=5;
        long facto=findFactorial(num);
        System.out.println(+facto);
    }
    public static long findFactorial(int num){
        if(num==0 || num==1){
            return 1;
        }else{
            return num* findFactorial(num-1);
        }
    }
}
