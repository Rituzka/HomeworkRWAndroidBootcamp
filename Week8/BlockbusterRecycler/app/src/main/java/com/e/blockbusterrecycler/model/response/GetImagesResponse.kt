package com.e.blockbusterrecycler.model.response

import com.e.blockbusterrecycler.model.Image
import kotlinx.serialization.Serializable


    @Serializable
    data class GetImagesResponse(val images: List<Image> = listOf())
