package day08.review;

public class Problem7 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 2};

        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
