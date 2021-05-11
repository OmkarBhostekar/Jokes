package com.omkarcodes.jokes.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.omkarcodes.jokes.repositories.JokeRepository

class JokeViewModelProviderFactory(
    val repository: JokeRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return JokeViewModel(repository) as T
    }
}