package com.radithp.parkeetestapp.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.radithp.jetpacksubmission3.vo.Status
import com.radithp.parkeetestapp.ViewModelFactory.ViewModelFactory
import com.radithp.parkeetestapp.databinding.FragmentMoviePopularBinding

class MoviePopularFragment : Fragment() {

    private lateinit var fragmentMoviePopular: FragmentMoviePopularBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentMoviePopular = FragmentMoviePopularBinding.inflate(layoutInflater,container,false)
        return fragmentMoviePopular.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[MoviePopularViewModel::class.java]

            val moviesPopularAdapter = MoviePopularAdapter()

            fragmentMoviePopular.progressBar.visibility = View.VISIBLE
            viewModel.getPopularMovies().observe(viewLifecycleOwner,{movies->
                if(movies != null){
                    when(movies.status){
                        Status.LOADING -> fragmentMoviePopular.progressBar.visibility = View.VISIBLE
                        Status.SUCCESS -> {
                            fragmentMoviePopular.progressBar.visibility = View.GONE
                            moviesPopularAdapter.submitList(movies.data)
                        }
                        Status.ERROR -> {
                            fragmentMoviePopular.progressBar.visibility = View.GONE
                            Toast.makeText(context,"Mistake", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            })
            with(fragmentMoviePopular.rvMovies) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = moviesPopularAdapter
            }
        }
    }


}