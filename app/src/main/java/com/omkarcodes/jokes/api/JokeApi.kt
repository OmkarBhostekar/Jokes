package com.omkarcodes.jokes.api

import com.omkarcodes.jokes.models.AllJokeResponse
import com.omkarcodes.jokes.models.JokeResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface JokeApi {

    @GET("/joke/Any")
    suspend fun getJoke(
        @Query("type") type: String
    ) : JokeResponse

    @GET("/joke/Any")
    suspend fun getAllJoke(
        @Query("amount") amount: Int = 10,
        @Query("type") type: String = "single"
    ) : AllJokeResponse
}