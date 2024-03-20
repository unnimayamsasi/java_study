package arrays;

public class Array_searchEleme {
    public static void main(String[] args) {
        int[] array={1,3,4,6,8};
        int target=6;
        boolean found=false;
        for(int i=0;i< array.length;i++){
            if(array[i] ==target){
                found=true;
                break;

            }
        }
        if(found){
            System.out.println("element found");
        }else{
            System.out.println("not found");
        }

    }
}
