package Models;

public class Movies {
    /**
     * @Param MovieName
     * @Param Director
     * @Param  Movielength
     * @Param generes
     */

private String movieName;
private String director;
private String movieLength;
private String geners;

    public Movies(String movieName, String director, String movieLength, String geners) {
        this.movieName = movieName;
        this.director = director;
        this.movieLength = movieLength;
        this.geners = geners;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(String movieLength) {
        this.movieLength = movieLength;
    }

    public String getGeners() {
        return geners;
    }

    public void setGeners(String geners) {
        this.geners = geners;
    }
//getters and setters, constructur
}
