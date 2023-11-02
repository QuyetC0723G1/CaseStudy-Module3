package service;

import model.Cart;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class CartService implements ICrud<Cart>{
    List<Cart> cartList = new ArrayList<>();
    @Override
    public void add(Cart cart) {

    }

    @Override
    public Cart findById(String id) {
        return null;
    }

    @Override
    public Cart findById(int id) {
        return null;
    }

    @Override
    public void edit(int id, Cart cart) {

    }

    @Override
    public void edit(String id, Cart cart) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public List<Cart> findAll() {
        return null;
    }

    @Override
    public List<Cart> findByName(String name) {
        return null;
    }
}
