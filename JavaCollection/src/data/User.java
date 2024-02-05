package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private String username;
    private String password;

    private List<String> files;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.files = new ArrayList<String>();
    }

    public void addFile(String name) {
        files.add(name);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getFiles() {
        return Collections.unmodifiableList(files);
    }
}
