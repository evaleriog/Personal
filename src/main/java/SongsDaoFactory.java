//this class is to create collection of songs

import java.sql.SQLException;

public class SongsDaoFactory {
    private static Songs songsDao;

    public static Songs getSongsDao(){
        if(songsDao == null){
            songsDao = new ListSongs();
        }

        return songsDao;
    }
}
