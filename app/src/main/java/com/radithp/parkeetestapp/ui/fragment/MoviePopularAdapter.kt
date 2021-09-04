package com.radithp.parkeetestapp.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.radithp.parkeetestapp.R
import com.radithp.parkeetestapp.data.local.entity.MovieEntity
import com.radithp.parkeetestapp.databinding.ItemsMoviePopularBinding

/**
Created by radit
 */
class MoviePopularAdapter: PagedListAdapter<MovieEntity,MoviePopularAdapter.MoviesPopularViewHolder>(DIFF_CALLBACK) {

    companion object{
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<MovieEntity>(){
            override fun areItemsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean{
                return oldItem.movieId == newItem.movieId
            }

            override fun areContentsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesPopularViewHolder {
        val itemsMoviePopularBinding = ItemsMoviePopularBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MoviesPopularViewHolder(itemsMoviePopularBinding)
    }

    override fun onBindViewHolder(holder: MoviesPopularViewHolder, position: Int) {
        val movies = getItem(position)
        if (movies != null) {
            holder.bind(movies)
        }
    }

    class MoviesPopularViewHolder(private val binding: ItemsMoviePopularBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(movie: MovieEntity){
            with(binding){
                tvItemTitle.text = movie.title
                Glide.with(itemView.context)
                    .load(movie.imagePath)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                    .into(imgPoster)
            }
        }
    }



}