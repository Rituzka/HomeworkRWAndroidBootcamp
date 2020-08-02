package com.e.blockbusterrecycler.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/e/blockbusterrecycler/ui/MovieListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/e/blockbusterrecycler/ui/MovieListViewHolder;", "clickListener", "Lcom/e/blockbusterrecycler/ui/MovieListAdapter$MovieItemClicked;", "(Lcom/e/blockbusterrecycler/ui/MovieListAdapter$MovieItemClicked;)V", "movies", "", "Lcom/e/blockbusterrecycler/networking/MovieModelApi;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setMovies", "", "MovieItemClicked", "app_debug"})
public final class MovieListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.e.blockbusterrecycler.ui.MovieListViewHolder> {
    private final java.util.List<com.e.blockbusterrecycler.networking.MovieModelApi> movies = null;
    private final com.e.blockbusterrecycler.ui.MovieListAdapter.MovieItemClicked clickListener = null;
    
    public final void setMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.e.blockbusterrecycler.networking.MovieModelApi> movies) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.e.blockbusterrecycler.ui.MovieListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.e.blockbusterrecycler.ui.MovieListViewHolder holder, int position) {
    }
    
    public MovieListAdapter(@org.jetbrains.annotations.NotNull()
    com.e.blockbusterrecycler.ui.MovieListAdapter.MovieItemClicked clickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/e/blockbusterrecycler/ui/MovieListAdapter$MovieItemClicked;", "", "listItemClicked", "", "list", "Lcom/e/blockbusterrecycler/networking/MovieModelApi;", "app_debug"})
    public static abstract interface MovieItemClicked {
        
        public abstract void listItemClicked(@org.jetbrains.annotations.NotNull()
        com.e.blockbusterrecycler.networking.MovieModelApi list);
    }
}