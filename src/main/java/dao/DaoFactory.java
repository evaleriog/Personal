package dao;//this class is to create collection of songs

import Model.*;

public class DaoFactory {
    private static Songs songsDao;

    public static Songs getSongsDao(){
        if(songsDao == null){
            songsDao = new ListSongs();
        }

        return songsDao;
    }
}
