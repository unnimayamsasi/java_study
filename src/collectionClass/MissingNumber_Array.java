package collectionClass;

public class MissingNumber_Array {
    public static int findMissingNumber(int[] numbers) {
        int n = numbers.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int num : numbers) {
            actualSum += num;
        }
        int missingnumber = expectedSum - actualSum;
        return missingnumber;
    }

    public static void main(String[] args) {
        int[] numbers= {1, 2, 4, 5, 6};
        int missingnumber = MissingNumber_Array.findMissingNumber(numbers);
        System.out.println("The missing number is: " + missingnumber);
    }
}



