package W4;

public class Song {

    private String name;
    private Singer singer;
    private MusicCompany musicCompany;
    private int releaseYear;
    private String songType;

    public Song(String name, Singer singer, MusicCompany musicCompany, int year, String songType) {
        this.name = name;
        this.singer = singer;
        this.musicCompany = musicCompany;
        this.releaseYear = year;
        this.songType = songType;
    }

    public String getName() {
        return this.name;
    }

    public Singer getSinger() {
        return this.singer;
    }

    public MusicCompany getMusicCompany() {
        return this.musicCompany;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public String getSongType() {
        return this.songType;
    }

    public String getMusicCompanyLocation() {
        return this.musicCompany.getLocation();
    }

    public boolean copyrighted() {
        int a = this.singer.getDeathYear();
        if (a == -1)
            return true;
        return 2022 - a < 75;
    }

}
