package com.e.blockbusterrecycler.networking

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    
    @SerializedName("Title") val title : String,
    @SerializedName("Year") val year : Int,
    @SerializedName("Released") val released : String,
    @SerializedName("Director") val director : String,
    @SerializedName("Actors") val actors : String,
    @SerializedName("Poster") val poster : String,
    @SerializedName("imdbID") val id : String,
    @SerializedName("Type") val type : String,
    @SerializedName("Response") val response : Boolean

)