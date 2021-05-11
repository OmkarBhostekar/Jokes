package com.omkarcodes.jokes.repositories

import com.omkarcodes.jokes.api.JokeApi

class JokeRepository(
    private val api: JokeApi
) {

    suspend fun getJoke() = api.getJoke("single")

    suspend fun getAllJokes() = api.getAllJoke()
}