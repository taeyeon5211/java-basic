package day08.review;

public class Problem8 {
    public static void main(String[] args) {
        int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
        int sum = 0;
        int cnt = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                sum += anInt;
                cnt++;
            }
        }
        double avg = (double) sum / cnt;
        System.out.println("sum = " + sum);
        System.out.printf("avg = %.2f", avg);
    }
}
