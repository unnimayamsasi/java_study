package operations;

public class Fib {
    public static void main(String[] args) {
        int num=10;
        System.out.println("fib uptp" +num);
        int firstTerm=0;
        int secondTerm =1;
                for(int i=1;i<=num;i++){
                    System.out.println(firstTerm+ " ");
                    int nextTerm=firstTerm+secondTerm;
                    firstTerm=secondTerm;
                    secondTerm=nextTerm;
                }

    }

}
