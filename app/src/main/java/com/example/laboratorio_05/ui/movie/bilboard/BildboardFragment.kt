package com.example.laboratorio_05.ui.movie.bilboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.laboratorio_05.R
import com.example.laboratorio_05.data.models.MovieModel
import com.example.laboratorio_05.databinding.FragmentBildboardBinding
import com.example.laboratorio_05.ui.movie.bilboard.recyclerView.MovieRecycleViewAdapter
import com.example.laboratorio_05.ui.movie.viewmodel.MovieViewModel
import java.nio.channels.SelectableChannel


class BildboardFragment : Fragment() {
    private lateinit var binding: FragmentBildboardBinding
    private lateinit var adapter: MovieRecycleViewAdapter

    private val movieViewModel: MovieViewModel by activityViewModels { MovieViewModel.Factory }

    private fun showSelectedMovie(movie: MovieModel){
        movieViewModel.setSelectedMovie(movie)
        findNavController().navigate(R.id.action_bildboardFragment_to_movieFragment)
    }

    private fun displayMovies() {
        adapter.setData(movieViewModel.getMovies())
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

    private fun setRecyclerView(view : View){
        binding.movieRecycleView.layoutManager = LinearLayoutManager(view.context)

        adapter = MovieRecycleViewAdapter { selectedMovie ->
            showSelectedMovie(selectedMovie)
        }

        binding.movieRecycleView.adapter = adapter
        displayMovies()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerView(view)

        binding.actionToCreatMovie.setOnClickListener {
            movieViewModel.clearData()
            view.findNavController().navigate(R.id.action_bildboardFragment_to_createMovieFragment)
        }
    }

}