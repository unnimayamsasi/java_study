package operations;

public class Array_sum {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int sum=0;
        for(int i=1;i<= array.length;i++){
            sum+=i;
        }
        System.out.println(+sum);
    }
}
