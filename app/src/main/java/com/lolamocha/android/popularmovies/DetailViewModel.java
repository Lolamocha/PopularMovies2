package com.lolamocha.android.popularmovies;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.lolamocha.android.popularmovies.database.AppDatabase;
import com.lolamocha.android.popularmovies.movieUtils.MovieData;

public class DetailViewModel extends ViewModel {
    private LiveData<MovieData> favorite;

    public DetailViewModel(AppDatabase db, int id) {
        favorite = db.favoriteDao().loadMovieEntry(id);
    }

    public LiveData<MovieData> getFavorite() {
        return favorite;
    }


}
