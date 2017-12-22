package xyz.zzp.ass_movie.activities.activities.viewholders;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import xyz.zzp.ass_movie.R;
import xyz.zzp.ass_movie.activities.activities.activities.MovieDetailsActivity;
import xyz.zzp.ass_movie.activities.activities.delegates.MovieActionDelegates;

/**
 * Created by Lenovo on 12/6/2017.
 */

public class ItemMoviesViewHolder extends RecyclerView.ViewHolder {
    private MovieActionDelegates mMovieActionDelegates;

    public ItemMoviesViewHolder(final View itemView,MovieActionDelegates movieActionDelegates)
    {
        super(itemView);
        ButterKnife.bind(this,itemView);

        mMovieActionDelegates = movieActionDelegates;
    }
    @OnClick(R.id.rl_movie_card)
    public void onMovieItemTap(View view){
        mMovieActionDelegates.onTapMovieItem();
    }
}


