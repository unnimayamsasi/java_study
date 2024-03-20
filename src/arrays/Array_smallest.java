package arrays;

public class Array_smallest {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int smallest=array[0];
        for(int i=1;i< array.length;i++){
            if(array[i]<smallest){
                smallest=array[i];
            }
        }
        System.out.println(+smallest);
    }
}
