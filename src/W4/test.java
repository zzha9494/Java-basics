package W4;

import java.util.List;

public class test {

    public static void main(String[] args) {
        Singer small_tony = new Singer("Tong Smith", 2000, -1);
        Singer big_tony = new Singer("Tong big smith", 1900, 1940);

        MusicCompany appleMusic = new MusicCompany("APPLE MUSIC", "Sydney");

        Song goodday = new Song("GOOD DAY", small_tony, appleMusic, 2010, "pop");
        Song war2 = new Song("WAR 2", big_tony, appleMusic, 1930, "rock");

        MusicStore market = new MusicStore("Market", 2020, "Sydney");

        market.addSong(goodday);
        market.addSong(goodday);
        market.addSong(war2);

        List<Song> listsinger = market.getSongsBySinger(small_tony);
        List<Song> listtype = market.getSongsBySongType("rock");



        System.out.println(war2.copyrighted());
    }

}
