package service;

import database.DbConnect;
import model.Product;
import model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        String sql = "insert into user(username, password,phonenumber) values (?,?,?);";
        try {
            PreparedStatement statement= connection.prepareStatement(sql);
            statement.setString(1,user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3,user.getPhoneNumber());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
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

    @Override
    public List<User> findAll() {

        return null;
    }

    @Override
    public List<User> findByName(String name) {
        return null;
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
                User u = new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(6));
                return u;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public User getUserByUsername(String username){
        try{
            String query = "select * from user where username =?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                User u = new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(6));
                return u;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

}
