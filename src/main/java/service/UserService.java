package service;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements ICrud<User>{
    List<User> users = new ArrayList<>();

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

    @Override
    public List<User> findAll() {

        return null;
    }

    boolean checkUser(int id){
        return false;
    }
}
