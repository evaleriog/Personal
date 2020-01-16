package Model;

public class User {
    private long id;
    private String first_name;
    private String last_name;
    private String username;
    private String email;
    private String password;
    private char premium;

    public User(){}

    public User(long id, String first_name, String last_name, String username, String email, String password, char premium){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.premium = premium;
    }

    public User(String first_name, String last_name, String username, String email, String password, char premium){
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.premium = premium;
    }

    public long getId(){
        return this.id;
    }

    public String getFirst_name(){
        return this.first_name;
    }

    public String getLast_name(){
        return this.last_name;
    }

    public String getUsername(){
        return this.username;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public char getPremium(){
        return this.premium;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setFirst_name(String name){
        this.first_name = name;
    }

    public void setLast_name(String name){
        this.last_name = name;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setPremium(char premium){
        this.premium = premium;
    }

    public  String toString(){
        return String.format("{Id: %d, FN: %s, LN: %s, Username: %s, Email: %s, Password: %s, Premium: %s}",
                getId(), getFirst_name(), getLast_name(), getUsername(), getEmail(), getPassword(), getPremium());
    }
}
