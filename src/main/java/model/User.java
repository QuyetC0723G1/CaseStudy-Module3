package model;

import sun.security.util.Password;

public class User {
    private int id;
    private String username;
    private String password;
    private int role;
    private boolean deleteFlag;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = 1;
//        this.deleteFlag = false;
    }

//    public boolean isDeleteFlag() {
//        return deleteFlag;
//    }
//
//    public void setDeleteFlag(boolean deleteFlag) {
//        this.deleteFlag = deleteFlag;
//    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
