package Model;//Model or Java Bean

public class Song {
    private long song_id;
    private String song_name;
    private String album_name;
    private String artist_name;
    private int length;
    private String genre;

    public Song(){};

    public Song(long id, String sname, String aname, String arname, int length, String genre){
        this.song_id = id;
        this.song_name = sname;
        this.album_name = aname;
        this.artist_name = arname;
        this.length = length;
        this.genre = genre;
    }

    //Getters
    public long getSong_id(){
        return this.song_id;
    }

    public String getSong_name(){
        return this.song_name;
    }

    public String getAlbum_name(){
        return this.album_name;
    }

    public String getArtist_name(){
        return this.artist_name;
    }

    public int getLength(){
        return this.length;
    }

    public String getGenre(){
        return this.genre;
    }

    //Setters
    public void setSong_id(long id){
        this.song_id = id;
    }

    public void setSong_name(String name){
        this.song_name = name;
    }

    public void setAlbum_name(String name){
        this.album_name = name;
    }

    public void setArtist_name(String name){
        this.album_name = name;
    }

    public void setLength(int l){
        this.length = l;
    }

    public  void setGenre(String g){
        this.genre = g;
    }

}
