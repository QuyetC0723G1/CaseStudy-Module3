package model;

import sun.security.util.Password;

public class User {
    private int id;
    private String username;
    private String password;
    private int role;
    private boolean deleteFlag;
    private int phoneNumber;

    public User(int id, String username, String password,int phoneNumber) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = 1;
        this.phoneNumber = phoneNumber;
//        this.deleteFlag = false;
    }

    public User(String username, String password,int phoneNumber) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
    //    public boolean isDeleteFlag() {
//        return deleteFlag;
//    }
//
//    public void setDeleteFlag(boolean deleteFlag) {
//        this.deleteFlag = deleteFlag;
//    }


    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

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
