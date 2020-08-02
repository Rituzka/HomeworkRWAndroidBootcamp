package com.e.blockbusterrecycler.networking;

import java.lang.System;

@androidx.room.Entity(tableName = "moviesData")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 32\u00020\u0001:\u00013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B[\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0010H\u00c6\u0003Jv\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\bH\u0016J\u0013\u0010+\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020\bH\u00d6\u0001J\t\u0010/\u001a\u00020\u0006H\u00d6\u0001J\u0018\u00100\u001a\u0002012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00102\u001a\u00020\bH\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001d\u00a8\u00064"}, d2 = {"Lcom/e/blockbusterrecycler/networking/MovieModelApi;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "title", "", "year", "", "released", "director", "actors", "poster", "id", "type", "response", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getActors", "()Ljava/lang/String;", "getDirector", "getId", "getPoster", "getReleased", "getResponse", "()Z", "getTitle", "getType", "getYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/e/blockbusterrecycler/networking/MovieModelApi;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public final class MovieModelApi implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Title")
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Year")
    private final java.lang.Integer year = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Released")
    private final java.lang.String released = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Director")
    private final java.lang.String director = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Actors")
    private final java.lang.String actors = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Poster")
    private final java.lang.String poster = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    @com.google.gson.annotations.SerializedName(value = "imdbID")
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Type")
    private final java.lang.String type = null;
    @com.google.gson.annotations.SerializedName(value = "Response")
    private final boolean response = false;
    public static final com.e.blockbusterrecycler.networking.MovieModelApi.CREATOR CREATOR = null;
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getYear() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleased() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDirector() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getActors() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPoster() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final boolean getResponse() {
        return false;
    }
    
    public MovieModelApi(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Integer year, @org.jetbrains.annotations.Nullable()
    java.lang.String released, @org.jetbrains.annotations.Nullable()
    java.lang.String director, @org.jetbrains.annotations.Nullable()
    java.lang.String actors, @org.jetbrains.annotations.Nullable()
    java.lang.String poster, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String type, boolean response) {
        super();
    }
    
    public MovieModelApi(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.e.blockbusterrecycler.networking.MovieModelApi copy(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Integer year, @org.jetbrains.annotations.Nullable()
    java.lang.String released, @org.jetbrains.annotations.Nullable()
    java.lang.String director, @org.jetbrains.annotations.Nullable()
    java.lang.String actors, @org.jetbrains.annotations.Nullable()
    java.lang.String poster, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String type, boolean response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/e/blockbusterrecycler/networking/MovieModelApi$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/e/blockbusterrecycler/networking/MovieModelApi;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/e/blockbusterrecycler/networking/MovieModelApi;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.e.blockbusterrecycler.networking.MovieModelApi> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.e.blockbusterrecycler.networking.MovieModelApi createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.e.blockbusterrecycler.networking.MovieModelApi[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}