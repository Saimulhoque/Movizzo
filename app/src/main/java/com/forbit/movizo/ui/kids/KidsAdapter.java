package com.forbit.movizo.ui.kids;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.forbit.movizo.R;

import java.util.List;

public class KidsAdapter extends RecyclerView.Adapter<KidsAdapter.MyViewHolder> {
    Context context;
    List<Kids> kidsList;
    LayoutInflater inflater;

    public KidsAdapter(Context context, List<Kids> kidsList) {
        this.context = context;
        this.kidsList = kidsList;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Kids kids = kidsList.get(position);
        holder.name.setText(kids.getMovieName());
        holder.image.setImageResource(kids.getMovieImage());
    }

    @Override
    public int getItemCount() {
        return kidsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.MovieName);
            image = itemView.findViewById(R.id.MovieImage);
        }
    }
}
