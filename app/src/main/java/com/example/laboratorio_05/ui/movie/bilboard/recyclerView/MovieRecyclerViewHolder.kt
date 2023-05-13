package com.example.laboratorio_05.ui.movie.bilboard.recyclerView

import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio_05.data.models.MovieModel
import com.example.laboratorio_05.databinding.MovieItemBinding
import com.example.laboratorio_05.ui.movie.viewmodel.MovieViewModel

class MovieRecyclerViewHolder(private val binding : MovieItemBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(movie: MovieModel, clickListener : (MovieViewModel) -> Unit) {
        binding.tittleTextView.text = movie.name
        binding.qualificationTextViewBilboard.text = movie.qualification

        binding.movieItemCard.setOnClickListener{
            clickListener(movie)
        }
    }
}