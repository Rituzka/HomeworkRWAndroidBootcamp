package com.e.blockbusterrecycler.networking

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

//Represents a movie from the API
@Entity(tableName = "moviesData")
data class MovieModelApi(

    @SerializedName("Title") val title : String?,
    @SerializedName("Year") val year : Int?,
    @SerializedName("Released") val released : String?,
    @SerializedName("Director") val director : String?,
    @SerializedName("Actors") val actors : String?,
    @SerializedName("Poster") val poster : String?,
    @PrimaryKey
    @SerializedName("imdbID") val id : String?,
    @SerializedName("Type") val type : String?,
    @SerializedName("Response") val response : Boolean

): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readByte() != 0.toByte()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        if (year != null) {
            parcel.writeInt(year)
        }
        parcel.writeString(released)
        parcel.writeString(director)
        parcel.writeString(actors)
        parcel.writeString(poster)
        parcel.writeString(id)
        parcel.writeString(type)
        parcel.writeByte(if (response) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MovieModelApi> {
        override fun createFromParcel(parcel: Parcel): MovieModelApi {
            return MovieModelApi(parcel)
        }

        override fun newArray(size: Int): Array<MovieModelApi?> {
            return arrayOfNulls(size)
        }
    }
}