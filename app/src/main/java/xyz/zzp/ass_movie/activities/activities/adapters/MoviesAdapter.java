package xyz.zzp.ass_movie.activities.activities.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.zzp.ass_movie.R;
import xyz.zzp.ass_movie.activities.activities.viewholders.ItemMoviesViewHolder;

/**
 * Created by Lenovo on 12/6/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View movieItemView = inflater.inflate(R.layout.item_movies, parent , false);
        ItemMoviesViewHolder itemMoviesViewHolder = new ItemMoviesViewHolder(movieItemView);
        return itemMoviesViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }
}
