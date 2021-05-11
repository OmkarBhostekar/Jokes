package com.omkarcodes.jokes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.omkarcodes.jokes.api.RetrofitInstance
import com.omkarcodes.jokes.databinding.ActivityMainBinding
import com.omkarcodes.jokes.repositories.JokeRepository
import com.omkarcodes.jokes.viewmodels.JokeViewModel
import com.omkarcodes.jokes.viewmodels.JokeViewModelProviderFactory

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: JokeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository = JokeRepository(RetrofitInstance.jokeApi)
        val providerFactory = JokeViewModelProviderFactory(repository)
        viewModel = ViewModelProvider(this,providerFactory).get(JokeViewModel::class.java)


    }


}