package day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BestMovieModeling {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("입력할 영화의 총개수를 입력하세요!");
        int movieTotal = sc.nextInt();

        //레벨업 3개의 영화를 배열로 관리하고 싶다. MovieArray를 만들어 3개의 영화정보를 입력 한 후 해당 전체 영화리스트를 출력
        MovieVO[] movieArray = new MovieVO[movieTotal];

        for (int i = 0; i < movieTotal; i++) {
            movieArray[i] = new MovieVO(null, null, null);
            //movieArray[i] = new MovieVo();
            StringTokenizer st = new StringTokenizer(br.readLine());
            movieArray[i].setMovieName(st.nextToken());
            movieArray[i].setMovieChar(st.nextToken());
            movieArray[i].setMovieAge(st.nextToken());
        }

        for (MovieVO movieVO : movieArray) {
            System.out.println(movieVO);
        }

//        MovieVO movie = new MovieVO("아바타", "2022.12.10", "제이크 설리", "액션", "192", "12");
//        System.out.println(movie);
//        movie.setMovieChar("정태연");
//        movie.setMovieTime("777");
//        System.out.println(movie);
//
//        System.out.println(movie.getMovieName() + " 영화 정보");
//        System.out.printf("제목 : %s%n", movie.getMovieName());
//        System.out.printf("배우 : %s%n", movie.getMovieChar());
//        System.out.printf("러닝타임 : %s%n", movie.getMovieTime());
//        System.out.printf("장르 : %s%n", movie.getMovieGenre());
    }
}
