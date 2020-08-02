package com.e.blockbusterrecycler.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/e/blockbusterrecycler/app/App;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
public final class App extends android.app.Application {
    private static com.e.blockbusterrecycler.app.App instance;
    @org.jetbrains.annotations.NotNull()
    public static com.e.blockbusterrecycler.model.MovieDatabase database;
    private static final kotlin.Lazy apiService$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy remoteApi$delegate = null;
    public static final com.e.blockbusterrecycler.app.App.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0010R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0017"}, d2 = {"Lcom/e/blockbusterrecycler/app/App$Companion;", "", "()V", "apiService", "Lcom/e/blockbusterrecycler/networking/RemoteApiService;", "getApiService", "()Lcom/e/blockbusterrecycler/networking/RemoteApiService;", "apiService$delegate", "Lkotlin/Lazy;", "database", "Lcom/e/blockbusterrecycler/model/MovieDatabase;", "getDatabase", "()Lcom/e/blockbusterrecycler/model/MovieDatabase;", "setDatabase", "(Lcom/e/blockbusterrecycler/model/MovieDatabase;)V", "instance", "Lcom/e/blockbusterrecycler/app/App;", "remoteApi", "Lcom/e/blockbusterrecycler/networking/RemoteApi;", "getRemoteApi", "()Lcom/e/blockbusterrecycler/networking/RemoteApi;", "remoteApi$delegate", "getAppContext", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.e.blockbusterrecycler.model.MovieDatabase getDatabase() {
            return null;
        }
        
        public final void setDatabase(@org.jetbrains.annotations.NotNull()
        com.e.blockbusterrecycler.model.MovieDatabase p0) {
        }
        
        private final com.e.blockbusterrecycler.networking.RemoteApiService getApiService() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.e.blockbusterrecycler.networking.RemoteApi getRemoteApi() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.e.blockbusterrecycler.app.App getAppContext() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}