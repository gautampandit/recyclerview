package com.neopixlab.recyclerviewtutorial;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sanjib on 12/11/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder>{

    private List<Movie> moviesList;

    public MoviesAdapter(List<Movie> moviesLest){
        this.moviesList = moviesLest;
    }//moviesAdapter

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row, parent, false);
        return new MyViewHolder(itemview);
    }//onCreateViewHolder

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
    }//onBindViewHolder

    @Override
    public int getItemCount() {
        return moviesList.size();
    }//getItem

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, year, genre;
        public MyViewHolder(View view){
            super(view);
            title = (TextView)view.findViewById(R.id.title);
            year = (TextView)view.findViewById(R.id.year);
            genre = (TextView)view.findViewById(R.id.genre);
        }//const

    }//myviewholder

}//moviesAdapter
