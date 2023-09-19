import java.time.Year;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Song song1 = new Song();
        song1.setTitle("Tung Nam Kang");
        song1.setArtist("Pai Song Gu Bor Kor Sor Du!");
        song1.setAlbum("The Greatest");
        song1.setYear(Year.of(2011));

        Song song2 = new Song();
        song2.setTitle("Koloboke");
        song2.setArtist("Pai Song Gu Bor Kor Sor Du!");
        song2.setAlbum("The Greatest");
        song2.setYear(Year.of(2015));

        Song song3 = new Song();
        song3.setTitle("Religious Ceremony Day");
        song3.setArtist("Pai Song Gu Bor Kor Sor Du!");
        song3.setAlbum("The Greatest");
        song3.setYear(Year.of(2017));

        Song song4 = new Song();
        song4.setTitle("My Father is Sultan");
        song4.setArtist("Pai Song Gu Bor Kor Sor Du!");
        song4.setAlbum("The Greatest");
        song4.setYear(Year.of(2015));

        Song song5 = new Song();
        song5.setTitle("I'm Smoker ni!");
        song5.setArtist("Pai Song Gu Bor Kor Sor Du!");
        song5.setAlbum("The Greatest");
        song5.setYear(Year.of(2019));

        Song song6 = new Song();
        song6.setTitle("Zebra want to drive a Jeep");
        song6.setArtist("Pai Song Gu Bor Kor Sor Du!");
        song6.setAlbum("The Greatest");
        song6.setYear(Year.of(2017));

        Song song7 = new Song();
        song7.setTitle("The Spoon");
        song7.setArtist("Oscar Jerome");
        song7.setAlbum("The Spoon");
        song7.setYear(Year.of(2022));

        Song song8 = new Song();
        song8.setTitle("Masterpiece");
        song8.setArtist("SAULT");
        song8.setAlbum("5");
        song8.setYear(Year.of(2019));

        MusicLibrary playlist1 = new MusicLibrary();
        playlist1.setName("My Playlist");
        playlist1.addSong(song1);
        playlist1.addSong(song2);
        playlist1.addSong(song3);
        playlist1.addSong(song4);
        playlist1.addSong(song5);
        playlist1.addSong(song6);
        playlist1.addSong(song7);
        playlist1.addSong(song8);

        playlist1.playRandomSong();
        playlist1.playRandomSong();
        playlist1.playRandomSong();

    }
}
