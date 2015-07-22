package com.cpmx6.devf.cpmx6.service;

import com.cpmx6.devf.cpmx6.model.DetailItem;
import com.cpmx6.devf.cpmx6.model.GiphyItem;
import com.cpmx6.devf.cpmx6.util.Constants;

import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Path;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by hugo on 7/19/15.
 */
public interface GiphyService {

     String API_KEY_QUERY ="api_key";
     String LIMIT_QUERY = "limit";
     String QUERY = "q";

    /**
     *
     * @param key
     * @param limit
     * @return
     */
    @Headers({Constants.X_MASHAPE_KEY_HEADER,
            Constants.ACCEPT_HEADER
    })
    @GET(Constants.GIPHY_TRENDING_ENDPOINT)
    Observable<GiphyItem> getGiphyTrending(
            @Query(API_KEY_QUERY) String key,
            @Query(LIMIT_QUERY)String limit);

    /**
     *
     * @param key
     * @param toSearch
     * @return
     */

    @Headers({Constants.X_MASHAPE_KEY_HEADER,
            Constants.ACCEPT_HEADER
    })
    @GET(Constants.GIPHY_SEARCH_ENDPOINT)
    Observable<GiphyItem> getGiphySearch(
            @Query(API_KEY_QUERY) String key,
            @Query(QUERY) String toSearch);

    /**
     *
     * @param key
     * @param giphyId
     * @return
     */
    @Headers({Constants.X_MASHAPE_KEY_HEADER,
            Constants.ACCEPT_HEADER
    })
    @GET("/gifs/{gif_id}")
    Observable<DetailItem> getItemDeatil(
            @Query(API_KEY_QUERY) String key,
            @Path("gif_id") String giphyId);
}
