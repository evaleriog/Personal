import java.util.List;
import java.util.ArrayList;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class ListSongs implements Songs {
    private List<Song> songs;

    public List<Song> allSongs(){
      return songs;
    }

    public List<Song> addSong(Song song){
        return songs;
    }

    public List<Song> removeSong(Song song){
        return songs;
    }

    public List<Song> updateSong(Song song){
        return songs;
    }

    public List<Song> findSong(Song song){
        return songs;
    }
}
