package com.moringaschool.tradewithme;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BestBuyApi {

    @GET("products?apiKey=BxaYUpnn8AUTWp69vYwpDi1V&format=json")
    Call<BestBuyProductSearchResponse> getProducts();
}
