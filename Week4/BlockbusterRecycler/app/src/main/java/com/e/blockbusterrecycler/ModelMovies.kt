package com.e.blockbusterrecycler

import android.os.Parcel
import android.os.Parcelable

data class ModelMovies (
    val id: Int,
    val releaseDate: String,
    val title: String,
    val summary: Int,
    val poster:Int,
    val detail:Int,
    val director: String,
    val stars: Int
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(releaseDate)
        parcel.writeString(title)
        parcel.writeInt(summary)
        parcel.writeInt(poster)
        parcel.writeInt(detail)
        parcel.writeString(director)
        parcel.writeInt(stars)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ModelMovies> {

        override fun createFromParcel(parcel: Parcel): ModelMovies {
            return ModelMovies(parcel)
        }

        override fun newArray(size: Int): Array<ModelMovies?> = arrayOfNulls(size)
    }
}

