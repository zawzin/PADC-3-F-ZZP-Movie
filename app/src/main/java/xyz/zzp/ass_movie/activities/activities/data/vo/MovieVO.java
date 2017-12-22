package xyz.zzp.ass_movie.activities.activities.data.vo;

/**
 * Created by Lenovo on 12/20/2017.
 */

public class MovieVO {
    private int code;
    private String message;
    private String apiVersion;
    private int page;
    private PopularMoviesVO popularMovies;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public int getPage() {
        return page;
    }

    public PopularMoviesVO getPopularMovies() {
        return popularMovies;
    }
}
