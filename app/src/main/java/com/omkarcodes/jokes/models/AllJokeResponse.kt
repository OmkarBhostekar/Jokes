package com.omkarcodes.jokes.models

data class AllJokeResponse(
    val error: Boolean,
    val amount: Int,
    val jokes: List<JokeResponse>
)
