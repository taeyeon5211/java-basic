package day11;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = solution(n);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int n) {
        int[][] arr = new int[n][n];
        int size = (n * (n + 1)) / 2;
        int[] answer = new int[size];
        int[] dx = {1, 0, -1};
        int[] dy = {0, 1, -1};
        int nx = 0;
        int ny = 0;

        int cnt = 1;
        arr[nx][ny] = cnt++;
        System.out.println(cnt);
        for (int i = 1; i <= n - 1; i++) {
            nx += dx[0];
            ny += dy[0];
            arr[nx][ny] = cnt++;
            System.out.println(cnt);
        }

        int index = 0;
        System.out.println(cnt);
        for (int i = n - 1; i >= 1; i--) {
            if (index == 2) {
                index = 0;
            } else {
                index++;
            }
            for (int j = 1; j <= i; j++) {
                nx += dx[index];
                ny += dy[index];
                arr[nx][ny] = cnt++;
                System.out.println(cnt);
            }
        }

        int index1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != 0) {
                    answer[index1++] = arr[i][j];
                }
            }
        }

        return answer;
    }
}
