package com.example.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("posts")
    public Call<List<User>> getpost(@Query("userId") int userid);
}
