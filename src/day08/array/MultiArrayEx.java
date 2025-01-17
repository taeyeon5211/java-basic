package day08.array;

public class MultiArrayEx {
    public static void main(String[] args) {
        //2차원 배열 생성
        int[][] scores = {
                {80,90,96},
                {76, 88}
        };
        //배열의 길이 1차원 배열의 길이(반의 수)
        System.out.println(scores.length + " scores[0]" + " scores[1]");
        System.out.println(scores[0][0]);
        System.out.println(scores[1][1]);

        for (int[] score : scores) {
            for (int i : score) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        //for-each 문을 이용하여 2반의 학생들의 점수 합산하고 평균을 구하여 출력
        int sum = 0;
        for (int i = 0; i < scores[1].length; i++) {
            sum += scores[1][i];
        }
        double average = (double) sum / scores[1].length;
        System.out.printf("%.1f%n", average);

        int sum1 = 0;
        int[] arr2 = scores[1];
        for (int i : arr2) {
            sum1 += i;
        }
        double average1 = (double) sum1/ arr2.length;
        System.out.printf("%.1f", average1);


    }
}
