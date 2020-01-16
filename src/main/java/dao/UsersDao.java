package dao;

import Model.Config;
import Model.User;
import Model.Users;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class UsersDao implements Users {
    private Connection connection;

    public UsersDao(){
        try {
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getURL(), config.getUsername(), config.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public User findUsername(String username){
        String sql = "SELECT * FROM users WHERE username = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                return new User(rs.getLong("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("premium").charAt(0)
                        );
            }
        }catch (SQLException e){
            e.getStackTrace();
        }

        return null;
    }

    public boolean findUsernameByEmail(String email){
        String sql = "SELECT * FROM users WHERE email = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                return true;
            }
        }catch (SQLException e){
            e.getStackTrace();
        }

        return false;
    }

    public Long insertUser(User user){
        String sql = "INSERT INTO users (first_name, last_name, email, password, premium, username) VALUES (?,?,?,?,?,?)";

        try{
            //checks if username or email already exists on database to return 0 before executing query
            if(findUsername(user.getUsername()) != null || findUsernameByEmail(user.getEmail())){
                return 0L;
            }

            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1,user.getFirst_name());
            stmt.setString(2,user.getLast_name());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getPassword());
            stmt.setString(5, Character.toString(user.getPremium()));
            stmt.setString(6, user.getUsername());
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();

            return rs.getLong(1);

        }catch (SQLException e) {
            e.printStackTrace();
            return 0L;
        }

    }

}
