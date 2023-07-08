package com.alvinamirulloh_201011400207.uts_aplikasiresepmasakan;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FriendsMethod {
    @GET("api/users?page=1")
    Call<FriendsModel> getAllData();
}
