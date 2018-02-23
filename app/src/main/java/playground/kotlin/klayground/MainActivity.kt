package playground.kotlin.klayground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieListView = findViewById<RecyclerView>(R.id.movie_list)

        val layoutManager = LinearLayoutManager(this)
        movieListView.layoutManager = layoutManager

        val movieList = arrayOf(
                Movie("", "One"),
                Movie("", "Two"),
                Movie("", "Three")
        )

        val movieListAdapter = MovieListAdapter(movieList)
        movieListView.adapter = movieListAdapter
    }
}
