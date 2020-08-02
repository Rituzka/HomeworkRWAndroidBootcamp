package com.e.blockbusterrecycler.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000eH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/e/blockbusterrecycler/networking/RemoteApiService;", "", "getBestMovies", "Lcom/e/blockbusterrecycler/model/response/GetMoviesResponse;", "query", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovies", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "request", "Lokhttp3/RequestBody;", "app_debug"})
public abstract interface RemoteApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/?apikey=8b5b7e2&s=star+wars")
    public abstract java.lang.Object getMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.e.blockbusterrecycler.model.response.GetMoviesResponse> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/?apikey=8b5b7e2&s=star+wars")
    public abstract java.lang.Object getBestMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.e.blockbusterrecycler.model.response.GetMoviesResponse> p1);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/register")
    public abstract retrofit2.Call<okhttp3.ResponseBody> registerUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody request);
}