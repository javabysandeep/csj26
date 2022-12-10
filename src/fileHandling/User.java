package fileHandling;

import java.io.Serializable;

public class User implements Serializable {
    int userId;
    String name;
    String email;
    String username;
    //don't save this field in the file while serializing the object
    transient String password;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User() {
    }

    public User(int userId, String name, String email, String username, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }
}
