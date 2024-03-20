package Methods;

public class Metho_Power_N {
    public static void main(String[] args) {
        int base=2;
        int exponent=3;
        double result=findPower(base,exponent);
        System.out.println(+result);
    }
    public static double findPower(int base, int exponent){
        return Math.pow(base,exponent);
    }
}
