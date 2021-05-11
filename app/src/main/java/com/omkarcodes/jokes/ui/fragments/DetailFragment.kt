package com.omkarcodes.jokes.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.omkarcodes.jokes.R
import com.omkarcodes.jokes.databinding.FragmentDetailBinding

class DetailFragment : Fragment(R.layout.fragment_detail) {

    lateinit var binding: FragmentDetailBinding
    val args: DetailFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetailBinding.bind(view)

        binding.tvJoke.text = args.joke
    }

}