package dao;

import java.sql.*;
import java.util.*;
import Model.*;
import com.mysql.cj.jdbc.Driver;

public class ListSongs implements Songs {
    private Connection connection;
    private List<Song> songs;

    public List<Song> all() throws SQLException {
        this.songs = new ArrayList<>();
        DriverManager.registerDriver(new Driver());
        Config config = new Config();
        connection = DriverManager.getConnection(config.getURL(), config.getUsername(), config.getPassword());
        Statement statement = connection.createStatement();
        String selectQuery = "SELECT * FROM songs LIMIT 10";
        ResultSet rs = statement.executeQuery(selectQuery);

        while (rs.next()){
            Song one = new Song(rs.getLong("song_id"),rs.getString("song_name"), rs.getString("album_name"), rs.getString("artist_name"), rs.getInt("length"), rs.getString("genre"));
            this.songs.add(one);
        }

        return this.songs;
    }

//    private List<Song> generateSongs() throws SQLException {
//        List<Song> allsong = new ArrayList<>();
//
//        connection = DriverManager.getConnection(config.getURL(), config.getUsername(), config.getPassword());
//        Statement statement = connection.createStatement();
//        String selectQuery = "SELECT * FROM songs LIMIT 10";
//        ResultSet rs = statement.executeQuery(selectQuery);
//
//        while (rs.next()){
//            Song one = new Song(rs.getLong("song_id"),rs.getString("song_name"), rs.getString("album_name"), rs.getString("artist_name"), rs.getInt("length"), rs.getString("genre"));
//            allsong.add(one);
//        }
//        //allsong.add(new Model.Song(1,"song","album", "artist", 345, "genre"));
//        return allsong;
//    }

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
