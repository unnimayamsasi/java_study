package looping;

public class PrimeOrNot {
    public static void main(String[] args) {
        int number = 21;
        boolean isPrime = true;
        if (number<=1){
            isPrime=false;
        }else {
            for (int i=2;i<number/2;i++){
                if(number% i==0){
                    isPrime=false;
                    break;

                }
            }
        }
        if (isPrime){
            System.out.println("it is a prime number");

        }else {
            System.out.println("it is not prime");
        }
    }
}

