package com.example.android.mymusicalstructureapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongHolder> {
    private ArrayList<Song> songItems;
    private LayoutInflater inflater;
    private CustomClickListener clickListener;

    public SongAdapter(Context context, ArrayList<Song> songItems, CustomClickListener clickListener) {
        this.songItems = songItems;
        this.clickListener = clickListener;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public SongHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycler_item, parent, false);
        final SongHolder songHolder = new SongHolder(view);
        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                clickListener.onItemClick(v, songHolder.getLayoutPosition());
            }
        });
        return songHolder;
    }

    @Override
    public void onBindViewHolder (SongHolder holder, int position){
        Song currentSong = songItems.get(position);
        holder.artistName.setText(currentSong.getArtistName());
        holder.artistSong.setText(currentSong.getArtistSong());
        holder.artistFeatured.setText(currentSong.getArtistFeatured());
    }
    @Override
    public int getItemCount(){return songItems.size();}
    class SongHolder extends RecyclerView.ViewHolder{
        private TextView artistName;
        private TextView artistSong;
        private TextView artistFeatured;

        public SongHolder (View songView){
            super (songView);
            artistName = songView.findViewById(R.id.artist_name);
            artistSong = songView.findViewById(R.id.song_name);
            artistFeatured = songView.findViewById(R.id.artist_feature);

        }

    }
}