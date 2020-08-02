package com.e.blockbusterrecycler.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H&J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/e/blockbusterrecycler/repository/MovieRepository;", "", "clearMovies", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllMovies", "Landroidx/lifecycle/LiveData;", "", "Lcom/e/blockbusterrecycler/networking/MovieModelApi;", "getMovieById", "movieId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMoviesForPage", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface MovieRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.e.blockbusterrecycler.networking.MovieModelApi>> getAllMovies();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMovieById(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.e.blockbusterrecycler.networking.MovieModelApi> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadMoviesForPage(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
}