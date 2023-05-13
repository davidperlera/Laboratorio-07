package com.example.laboratorio_05.ui.movie.bilboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.laboratorio_05.R
import com.example.laboratorio_05.data.models.MovieModel
import com.example.laboratorio_05.databinding.FragmentBildboardBinding
import com.example.laboratorio_05.ui.movie.bilboard.recyclerView.MovieRecycleViewAdapter
import com.example.laboratorio_05.ui.movie.viewmodel.MovieViewModel


class BildboardFragment : Fragment() {
    private lateinit var binding: FragmentBildboardBinding
    private lateinit var adapter: MovieRecycleViewAdapter

    private fun showSelectedMovie(movie: MovieModel){
        MovieViewModel.setSelectedMovie(movie)
        findNavController().navigate(R.id.action_bildboardFragment_to_movieFragment)
    }

    private fun displayMovies() {
        adapter.setData(MovieViewModel.getMovies())
        adapter.notifyDataSetChanged()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBildboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.actionToCreatMovie.setOnClickListener {
            view.findNavController().navigate(R.id.action_bildboardFragment_to_createMovieFragment)
        }

        binding.movieItemCard.setOnClickListener{
            view.findNavController().navigate(R.id.action_bildboardFragment_to_movieFragment)
        }

    }

}