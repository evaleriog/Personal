package Model;

public interface Users {
    User findUsername(String username);

    Long insertUser(User user);
}