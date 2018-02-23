package playground.kotlin.klayground

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

class MovieListAdapter(val movieList: Array<Movie>) : RecyclerView.Adapter<MovieListAdapter.MovieViewHolder>() {
    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder?, position: Int) {
        holder?.item?.text = movieList[position].title
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.movie_item, parent, false) as TextView
        return MovieViewHolder(view)
    }

    class MovieViewHolder(val item: TextView) : RecyclerView.ViewHolder(item)
}