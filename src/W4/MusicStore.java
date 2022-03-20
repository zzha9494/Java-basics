package W4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MusicStore {

    private String name;
    private int openYear;
    private String location;
    private HashMap<Song, Integer> songs;

    public MusicStore(String name, int year, String location) {
        this.name = name;
        this.openYear = year;
        this.location = location;
    }

    public String getName() {
        return this.name;
    }

    public int getOpenYear() {
        return this.openYear;
    }

    public String getLocation() {
        return this.location;
    }

    public HashMap<Song, Integer> getSongs() {
        return this.songs;
    }

    public List<Song> getSongsBySongType(String songType) {
        List<Song> temp = new ArrayList<Song>();

        for (Song i: this.songs.keySet()) {
            if (i.getSongType().equals(songType))
                temp.add(i);
        }
        return temp;
    }

    public List<Song> getSongsBySinger(Singer singer) {
        List<Song> temp = new ArrayList<Song>();

        for (Song i: this.songs.keySet()) {
            if (i.getSinger() == singer)
                temp.add(i);
        }
        return temp;
    }

    public void addSong(Song song) {
        if (this.songs == null)
            this.songs = new HashMap<Song, Integer>();

        if (!this.songs.containsKey(song))
            this.songs.put(song, 1);
        else {
            Integer num = this.songs.get(song);
            this.songs.put(song, num+1);
        }
    }

}
