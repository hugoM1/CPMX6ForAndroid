package com.cpmx6.devf.cpmx6.api;

import com.cpmx6.devf.cpmx6.model.DetailItem;
import com.cpmx6.devf.cpmx6.model.GiphyItem;
import com.cpmx6.devf.cpmx6.service.GiphyService;
import com.cpmx6.devf.cpmx6.util.Constants;

import retrofit.RestAdapter;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by hugo on 7/19/15.
 */
public class GiphyApiManager {
    private final GiphyService mGiphyService;

    public GiphyApiManager() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(Constants.GIPHY_API_ENDPOINT)
                .setLogLevel(RestAdapter.LogLevel.BASIC)
                .build();
        mGiphyService =
                restAdapter.create(GiphyService.class);
    }

    public Observable<GiphyItem> getTrendingGiphy() {
        return mGiphyService.getGiphyTrending(Constants.API_KEY, Constants.CONTENT_LIMIT)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<GiphyItem> searchGiphy(String toSearch){
        return mGiphyService.getGiphySearch(Constants.API_KEY, toSearch)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<DetailItem> getItemDetetailById(String giphyId){
        return mGiphyService.getItemDeatil(Constants.API_KEY, giphyId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
