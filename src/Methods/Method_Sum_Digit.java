package Methods;

public class Method_Sum_Digit {
    public static void main(String[] args) {
        int num=12345;
        int sum=findDigitSum(num);
        System.out.println(+sum);
    }
    public static int findDigitSum(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;

        }
        return sum;
    }
}
