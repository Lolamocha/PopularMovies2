package com.lolamocha.android.popularmovies.networkUtils;

import com.lolamocha.android.popularmovies.movieUtils.MovieAPIResults;
import com.lolamocha.android.popularmovies.networkUtils.MovieAPIInterface;
import com.lolamocha.android.popularmovies.reviewUtils.ReviewResults;
import com.lolamocha.android.popularmovies.videoUtils.VideoResults;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkUtils {
    private static final String API_KEY = "api key here";
    private static final String BASE_URL = "http://api.themoviedb.org/3/movie/";

    public static final String POPULAR = "popular";
    public static final String TOP_RATED = "top_rated";

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static MovieAPIInterface sMovieAPIInterface = retrofit.create(MovieAPIInterface.class);

    public static Call<MovieAPIResults> buildAPICall(String sortOrder) {

        Call<MovieAPIResults> call = sMovieAPIInterface.getMovieData(sortOrder, API_KEY);

        return call;
    }

    public static Call<VideoResults> buildVideoCall(int videoId) {

        Call<VideoResults> call = sMovieAPIInterface.getVideoData(videoId, API_KEY);

        return call;
    }

    public static Call<ReviewResults> buildReviewCall(int videoId) {
        Call<ReviewResults> call = sMovieAPIInterface.getReviewData(videoId, API_KEY);
        return call;
    }

}
