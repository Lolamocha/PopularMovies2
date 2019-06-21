package com.lolamocha.android.popularmovies.videoUtils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VideoResults {


    @SerializedName("results")
    @Expose
    private List<Video> mResults = null;

    public List<Video> getVideoList() {
        return mResults;
    }

    public interface VideoAcquiredListener {
        void onVideosAcquired(List<Video> videos);
    }

}
