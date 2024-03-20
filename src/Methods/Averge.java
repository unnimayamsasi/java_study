package Methods;

public class Averge {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 6, 2};
        double avg = findAverage(numbers);
        System.out.println(+avg);
    }

    public static double findAverage(int[] numbers) {
        int sum = 0;
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
        }
            return (double) sum / numbers.length;
        }



}
