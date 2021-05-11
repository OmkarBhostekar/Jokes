package com.omkarcodes.jokes.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.omkarcodes.jokes.R
import com.omkarcodes.jokes.databinding.FragmentDetailBinding
import com.omkarcodes.jokes.databinding.FragmentHomeBinding

class DetailFragment : Fragment(R.layout.fragment_detail) {

    lateinit var binding: FragmentDetailBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetailBinding.bind(view)
    }

}