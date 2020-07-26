package com.e.blockbusterrecycler.model

//Represents the Success and Failure cases from the remote Api
sealed class Result<out T : Any>

data class Success<out T: Any>(val data: T): Result<T>()

data class Failure(val error: Throwable?) : Result<Nothing>()