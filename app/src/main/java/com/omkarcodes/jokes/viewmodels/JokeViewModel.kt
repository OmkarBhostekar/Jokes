package com.omkarcodes.jokes.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omkarcodes.jokes.models.AllJokeResponse
import com.omkarcodes.jokes.models.JokeResponse
import com.omkarcodes.jokes.repositories.JokeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class JokeViewModel(
    val repository: JokeRepository
) : ViewModel() {

    val joke: MutableLiveData<JokeResponse> = MutableLiveData()
    val allJokes: MutableLiveData<List<JokeResponse>> = MutableLiveData()

    fun getJoke() = viewModelScope.launch {
        val response = repository.getJoke()
        joke.postValue(response)
    }

    fun getAllJokes() = viewModelScope.launch(Dispatchers.IO) {
        val response = repository.getAllJokes()
        allJokes.postValue(response.jokes)
    }

}