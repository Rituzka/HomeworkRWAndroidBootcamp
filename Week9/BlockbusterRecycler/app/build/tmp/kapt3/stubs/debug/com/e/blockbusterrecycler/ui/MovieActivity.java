package com.e.blockbusterrecycler.ui;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\u0012H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/e/blockbusterrecycler/ui/MovieActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/e/blockbusterrecycler/ui/MovieListAdapter$MovieItemClicked;", "()V", "movieAdapter", "Lcom/e/blockbusterrecycler/ui/MovieListAdapter;", "getMovieAdapter", "()Lcom/e/blockbusterrecycler/ui/MovieListAdapter;", "movieAdapter$delegate", "Lkotlin/Lazy;", "moviesViewModel", "Lcom/e/blockbusterrecycler/viewModel/MoviesViewModel;", "buildConstraints", "Landroidx/work/Constraints;", "buildWorker", "Landroidx/work/PeriodicWorkRequest;", "constraints", "goToLogin", "", "initListMovies", "listItemClicked", "list", "Lcom/e/blockbusterrecycler/networking/MovieModelApi;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "showMovieDetail", "stopSynchronization", "synchronization", "app_debug"})
public final class MovieActivity extends androidx.appcompat.app.AppCompatActivity implements com.e.blockbusterrecycler.ui.MovieListAdapter.MovieItemClicked {
    private final kotlin.Lazy movieAdapter$delegate = null;
    private com.e.blockbusterrecycler.viewModel.MoviesViewModel moviesViewModel;
    private java.util.HashMap _$_findViewCache;
    
    private final com.e.blockbusterrecycler.ui.MovieListAdapter getMovieAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initListMovies() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void showMovieDetail(com.e.blockbusterrecycler.networking.MovieModelApi list) {
    }
    
    @java.lang.Override()
    public void listItemClicked(@org.jetbrains.annotations.NotNull()
    com.e.blockbusterrecycler.networking.MovieModelApi list) {
    }
    
    private final void synchronization() {
    }
    
    private final void stopSynchronization() {
    }
    
    private final androidx.work.Constraints buildConstraints() {
        return null;
    }
    
    private final androidx.work.PeriodicWorkRequest buildWorker(androidx.work.Constraints constraints) {
        return null;
    }
    
    private final void goToLogin() {
    }
    
    public MovieActivity() {
        super();
    }
}