package dao;//this class is to create collection of songs

import Model.*;

public class DaoFactory {
    private static Songs songsDao;
    private static Users usersDao;

    public static Songs getSongsDao(){
        if(songsDao == null){
            songsDao = new ListSongs();
        }

        return songsDao;
    }

    public static Users getUsersDao(){
        if(usersDao == null){
            usersDao = new UsersDao();
        }

        return usersDao;
    }
}
