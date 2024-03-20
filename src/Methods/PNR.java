package Methods;

public class PNR {
    public static void main(String[] args) {
        double p=1000;
        double r=0.5;
        int n=5;
        double futureValue=findFutureVale(p,r,n);
        System.out.println(+futureValue);
    }
    public static double findFutureVale(double p,double r,int n){
        return p*r*n;
    }
}
