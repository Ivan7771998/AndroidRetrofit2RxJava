package com.example.androidretrofit2rxjava.retrofit;



import com.example.androidretrofit2rxjava.model.Post;

import java.util.List;


import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IMyAPI {

    @GET("posts")
    Observable<List<Post>> getPosts();

}
