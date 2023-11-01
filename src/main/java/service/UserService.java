package service;

import database.DbConnect;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserService implements ICrud<User>{
    List<User> users = new ArrayList<>();
    private final Connection connection = DbConnect.getConnection();

    public UserService() {
//        users.add(new User("dangquyet.vttb","dangquyet"));
    }

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public void edit(int id, User user) {
    }
    @Override
    public void edit(String id, User user) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void remove(String id) {

    }
    boolean checkUser(int id){
        return false;
    }

    public User getUser(String username, String password){
        try{
            String query = "select * from user where username =? and password =?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,username);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                User u = new User(rs.getString(2),rs.getString(3),rs.getString(6),rs.getInt(4));
                return u;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

}
