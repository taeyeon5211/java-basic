package day11;

public class MovieVO {

    private String movieName;
    private String movieDate;
    private String movieChar;
    private String movieGenre;
    private String movieTime;
    private String movieAge;

    public MovieVO() {

    }

    public MovieVO(String movieName, String movieChar, String movieAge) {
        this.movieName = movieName;
        this.movieChar = movieChar;
        this.movieAge = movieAge;
    }

    public MovieVO(String movieName, String movieDate, String movieChar, String movieGenre, String movieTime, String movieAge) {
        this.movieName = movieName;
        this.movieDate = movieDate;
        this.movieChar = movieChar;
        this.movieGenre = movieGenre;
        this.movieTime = movieTime;
        this.movieAge = movieAge;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieChar() {
        return movieChar;
    }

    public void setMovieChar(String movieChar) {
        this.movieChar = movieChar;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMovieAge() {
        return movieAge;
    }

    public void setMovieAge(String movieAge) {
        this.movieAge = movieAge;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "movieName='" + movieName + '\'' +
                ", movieDate='" + movieDate + '\'' +
                ", movieChar='" + movieChar + '\'' +
                ", movieGenre='" + movieGenre + '\'' +
                ", movieTime='" + movieTime + '\'' +
                ", movieAge='" + movieAge + '\'' +
                '}';
    }
}
