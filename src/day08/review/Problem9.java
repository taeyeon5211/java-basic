package day08.review;

import java.io.*;

public class Problem9 {
    static int size;
    static int[] scores;
    static int max;
    static double avg;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            System.out.println("---------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("---------------------------------------------------");
            System.out.print("선택> ");
            int choice = Integer.parseInt(br.readLine());
            if (choice == 1) {
                System.out.print("학생수> ");
                size = Integer.parseInt(br.readLine());
                scores = new int[size];
            } else if (choice == 2) {
                for (int i = 0; i < size; i++) {
                    System.out.print("scores[" + i + "] = ");
                    int score = Integer.parseInt(br.readLine());
                    scores[i] = score;
                }
            } else if (choice == 3) {
                for (int i = 0; i < size; i++) {
                    bw.write("scores[" + i + "] = " + scores[i] + "\n");
                    bw.flush();
                }
            } else if (choice == 4) {
                int sum = 0;
                for (int score : scores) {
                    if (score > max) {
                        max = score;
                    }
                    sum += score;
                }
                avg = (double) sum / scores.length;
                bw.write("최고 점수 : " + max + "\n");
                bw.write("평균 점수 : " + avg + "\n");
                bw.flush();
            } else if (choice == 5) {
                bw.write("프로그램 종료\n");
                bw.flush();
                break;
            } else {
                bw.write("다시 입력하세요!\n");
                bw.flush();
            }
        }
    }
}
