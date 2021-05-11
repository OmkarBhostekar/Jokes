package com.omkarcodes.jokes.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.omkarcodes.jokes.MainActivity
import com.omkarcodes.jokes.R
import com.omkarcodes.jokes.databinding.FragmentHomeBinding
import com.omkarcodes.jokes.models.JokeResponse
import com.omkarcodes.jokes.ui.adapters.JokeAdapter
import com.omkarcodes.jokes.viewmodels.JokeViewModel

class HomeFragment : Fragment(R.layout.fragment_home),JokeAdapter.OnClickListener {

    lateinit var binding: FragmentHomeBinding
    lateinit var viewModel: JokeViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        viewModel = (activity as MainActivity).viewModel

        viewModel.getAllJokes()

        viewModel.allJokes.observe(viewLifecycleOwner,{
            setupRecyclerView(it)
        })
    }

    private fun setupRecyclerView(it: List<JokeResponse>?) {
        binding.rvJokes.adapter = it?.let { it1 -> JokeAdapter(it1,this) }
        binding.rvJokes.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun onClick(joke: String) {
        findNavController().navigate(R.id.action_homeFragment_to_detailFragment,Bundle().apply {
            putString("joke",joke)
        })
    }

}
