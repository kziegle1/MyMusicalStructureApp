package com.example.android.mymusicalstructureapp;

import com.example.android.mymusicalstructureapp.R;
import com.example.android.mymusicalstructureapp.Song;

import java.util.ArrayList;

public class songList extends ArrayList {
    private ArrayList<Song> SongItems = new ArrayList<>();
    public ArrayList getSongList(){
        SongItems.add(new Song ("P!nk","Revenge",
                R.drawable.pinkbeautifultrauma, "feat.Eminem"));
        SongItems.add(new Song ("P!nk","Most Girls",
                R.drawable.pinkcanttakemehome, ""));
        SongItems.add(new Song ("P!nk","Dear Mr.President",
                R.drawable.pinkimnotdead, "feat.Indigo Girls"));
        SongItems.add(new Song ("P!nk","Respect",
                R.drawable.pinkmissunda, "feat. Scratch"));
        SongItems.add(new Song ("P!nk","True Love",
                R.drawable.pinkthetruthaboutlove, "feat. Lily Allen"));
        return SongItems;

    }
}
