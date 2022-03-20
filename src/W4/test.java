package W4;

public class test {

    public static void main(String[] args) {
        Singer small_tony = new Singer("Tong Smith", 2000, -1);
        Singer big_tony = new Singer("Tong big smith", 1900, 1940);

        MusicCompany appleMusic = new MusicCompany("APPLE MUSIC", "Sydney");

        Song goodday = new Song("GOOD DAY", small_tony, appleMusic, 2010, "pop");
        Song war2 = new Song("WAR 2", big_tony, appleMusic, 1930, "pop");

        System.out.println(war2.copyrighted());
    }

}
