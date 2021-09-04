package com.radithp.jetpacksubmission3.utils

import android.content.Context
import com.radithp.jetpacksubmission3.data.source.remote.MoviesResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.util.ArrayList

/**
Created by radit
 */
class JsonHelper(private val context: Context) {

    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)

        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun loadMovies(): List<MoviesResponse>{
        val list = ArrayList<MoviesResponse>()
        try{
            val responseObject = JSONObject(parsingFileToString("movies.json").toString())
            val listArray = responseObject.getJSONArray("movies")
            for(i in 0 until listArray.length()){
                val movies = listArray.getJSONObject(i)

                val id = movies.getString("id")
                val title = movies.getString("title")
                val synopsis = movies.getString("synopsis")
                val releaseDate = movies.getString("release_date")
                val cast = movies.getString("cast")
                val posterPath = movies.getString("poster_img")

                val moviesRespons = MoviesResponse(id,title,synopsis,releaseDate,cast,posterPath)
                list.add(moviesRespons)
            }
        }catch (e:JSONException){
            e.printStackTrace()
        }
        return list
    }
}