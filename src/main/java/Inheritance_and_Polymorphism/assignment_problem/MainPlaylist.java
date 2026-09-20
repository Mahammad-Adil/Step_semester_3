class Playlist {

    private String[] songs;
    private int songCount;

    // Constructor
    public Playlist(int maxSongs) {
        songs = new String[maxSongs];
        songCount = 0;
    }

    // Add a song
    public void addSong(String song) {
        if (songCount < songs.length) {
            songs[songCount] = song;
            songCount++;
        }
    }

    // Return a copy of the songs
    public String[] getSongs() {
        String[] copy = new String[songCount];

        for (int i = 0; i < songCount; i++) {
            copy[i] = songs[i];
        }

        return copy;
    }

    // Return number of songs
    public int getSongCount() {
        return songCount;
    }
}

public class MainPlaylist {
    public static void main(String[] args) {

        Playlist p = new Playlist(10);

        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();

        System.out.println("Before modifying copy:");
        System.out.println(copy[0]);
        System.out.println(copy[1]);

        // Modify the returned array
        copy[0] = "Hacked";

        System.out.println("\nModified copy:");
        System.out.println(copy[0]);

        System.out.println("\nActual playlist:");
        String[] actualSongs = p.getSongs();
        System.out.println(actualSongs[0]);
        System.out.println(actualSongs[1]);

        System.out.println("\nSong Count = " + p.getSongCount());
    }
}