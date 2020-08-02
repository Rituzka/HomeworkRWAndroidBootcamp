package com.e.blockbusterrecycler.model

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class Movie (
    @PrimaryKey val id: Int,
    val releaseDate: String,
    val title: String,
    val summary: String,
    val poster:Int,
    val detail:Int,
    val director: String,
    val stars: String
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(releaseDate)
        parcel.writeString(title)
        parcel.writeString(summary)
        parcel.writeInt(poster)
        parcel.writeInt(detail)
        parcel.writeString(director)
        parcel.writeString(stars)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {

        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> = arrayOfNulls(size)
    }
}

