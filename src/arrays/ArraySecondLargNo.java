package arrays;

public class ArraySecondLargNo {
    public static void main(String[] args) {
      int[] array={1,4,2,7,3};
      int largest=array[0];
      int secondLargest=Integer.MIN_VALUE;
      for (int i=1;i<array.length;i++) {
          if (array[i] > largest) {
              secondLargest = largest;
              largest = array[i];
          } else if (array[i] > secondLargest && array[i] != largest) {
              secondLargest = array[i];

          }
      }
          if (secondLargest!=Integer.MIN_VALUE){
              System.out.println(+secondLargest);
          }else {
              System.out.println("There is no second largest number");
          }

    }
}
