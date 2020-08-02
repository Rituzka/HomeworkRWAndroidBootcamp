package com.e.blockbusterrecycler.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/e/blockbusterrecycler/viewModel/MoviesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/e/blockbusterrecycler/repository/MovieRepository;", "(Lcom/e/blockbusterrecycler/repository/MovieRepository;)V", "counter", "", "moviesLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/e/blockbusterrecycler/networking/MovieModelApi;", "fetchMovies", "", "getMoviesLiveData", "app_debug"})
public final class MoviesViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.LiveData<java.util.List<com.e.blockbusterrecycler.networking.MovieModelApi>> moviesLiveData = null;
    private int counter = 1;
    private final com.e.blockbusterrecycler.repository.MovieRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.e.blockbusterrecycler.networking.MovieModelApi>> getMoviesLiveData() {
        return null;
    }
    
    public final void fetchMovies() {
    }
    
    public MoviesViewModel(@org.jetbrains.annotations.NotNull()
    com.e.blockbusterrecycler.repository.MovieRepository repository) {
        super();
    }
}