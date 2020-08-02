package com.e.blockbusterrecycler.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH\u0016J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/e/blockbusterrecycler/repository/MovieRoomRepo;", "Lcom/e/blockbusterrecycler/repository/MovieRepository;", "movieApiService", "Lcom/e/blockbusterrecycler/networking/RemoteApiService;", "(Lcom/e/blockbusterrecycler/networking/RemoteApiService;)V", "movieDao", "Lcom/e/blockbusterrecycler/model/MovieDAO;", "clearMovies", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllMovies", "Landroidx/lifecycle/LiveData;", "", "Lcom/e/blockbusterrecycler/networking/MovieModelApi;", "getMovieById", "movieId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMoviesForPage", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeMovies", "movies", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeMoviesIfNotEmpty", "app_debug"})
public class MovieRoomRepo implements com.e.blockbusterrecycler.repository.MovieRepository {
    private final com.e.blockbusterrecycler.model.MovieDAO movieDao = null;
    private final com.e.blockbusterrecycler.networking.RemoteApiService movieApiService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.e.blockbusterrecycler.networking.MovieModelApi>> getAllMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMovieById(@org.jetbrains.annotations.NotNull()
    java.lang.String p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.e.blockbusterrecycler.networking.MovieModelApi> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object storeMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.e.blockbusterrecycler.networking.MovieModelApi> movies, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object storeMoviesIfNotEmpty(@org.jetbrains.annotations.NotNull()
    java.util.List<com.e.blockbusterrecycler.networking.MovieModelApi> movies, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadMoviesForPage(int p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object clearMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    public MovieRoomRepo(@org.jetbrains.annotations.NotNull()
    com.e.blockbusterrecycler.networking.RemoteApiService movieApiService) {
        super();
    }
}