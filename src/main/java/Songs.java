import java.util.List;

//Interface to describe the DAO
public interface Songs {
    List<Song> allSongs(); //find all songs in record
    List<Song> addSong(Song song); //add a song to the record
    List<Song> removeSong(Song song); //remove a song from the record
    List<Song> updateSong(Song song); //updates song from the record
    List<Song> findSong(Song song); //find a song in the record
}
