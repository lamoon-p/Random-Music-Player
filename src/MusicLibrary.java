import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibrary {

    private String name;
    private List<Song> songs = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println(song.getTitle() + " added to collection!");
    }

    public void removeSong(Song song) {
        songs.remove(song);
        System.out.println(song.getTitle() + " removed from collection!");
    }

    public void playRandomSong() {

        Random rand = new Random();
        Song nowPlaying = getSongs().get(rand.nextInt(getSongs().size()));
        System.out.println(nowPlaying.getTitle() + " by " + nowPlaying.getArtist() + " is playing.");
    }

    @Override
    public String toString() {
        return "MusicLibrary{" +
                "name='" + name + '\'' +
                ", songs=" + songs +
                '}';
    }
}
