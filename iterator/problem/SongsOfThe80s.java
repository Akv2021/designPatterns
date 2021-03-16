import java.util.Arrays;

public class SongsOfThe80s{

    // Create an array of SongInfo Objects

    SongInfo[] bestSongs;

    // Used to increment to the next position in the array

    int arrayValue = 0;

    public SongsOfThe80s() {

        bestSongs = new SongInfo[3];

        addSong("Roam", "B 52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears For Fears", 1985);

    }

    // Add a SongInfo Object to the array and increment to the next position

    public void addSong(String songName, String bandName, int yearReleased){

        SongInfo song = new SongInfo(songName, bandName, yearReleased);

        bestSongs[arrayValue] = song;

        arrayValue++;

    }

    public SongInfo[] getBestSongs(){

        return bestSongs;

    }

}