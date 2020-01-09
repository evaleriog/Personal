public class Config {
    public String getURL(){
        return "jdbc:mysql://localhost/music_db?serverTimezone=UTC&useSSL=false";
    }

    public String getUsername(){
        return "eduardo";
    }

    public String getPassword(){
        return "password";
    }
}
