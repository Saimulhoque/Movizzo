package com.forbit.movizo.ui.main.recentlyadded;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.forbit.movizo.R;
import com.forbit.movizo.ui.main.popularVideos.MovieList;
import com.forbit.movizo.ui.main.popularVideos.RecyclerviewAdapter;

import java.util.ArrayList;

public class RecentlyAddedFragment extends Fragment {

    RecyclerviewAdapter recyclerviewAdapter;
    ArrayList<MovieList> movieLists;
    RecyclerView recyclerView;

    public RecentlyAddedFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        movieLists = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            movieLists.add(new MovieList(R.drawable.movie3, "Movie " + String.valueOf(i + 1)));
        }

//        movieLists.add(new MovieList(R.drawable.movie1, "movie2"));
//        movieLists.add(new MovieList(R.drawable.movie1, "movie3"));
//        movieLists.add(new MovieList(R.drawable.movie1, "movie4"));
//        movieLists.add(new MovieList(R.drawable.movie1, "movie5"));
//        movieLists.add(new MovieList(R.drawable.movie1, "movie6"));

        recyclerviewAdapter = new RecyclerviewAdapter(getContext(), movieLists);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recently_added, container, false);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recyclerviewAdapter);

        return view;
    }
}