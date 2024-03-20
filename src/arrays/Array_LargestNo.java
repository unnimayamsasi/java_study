package arrays;

public class Array_LargestNo {
    public static void main(String[] args) {
        int[] array={4,6,1,8,7};
        int largest=array[0];
        for(int i=1;i< array.length;i++){
            if(array[i] > largest){
                largest= array[i];
            }
        }
        System.out.println(+largest);
    }
}
