package service;

import model.Order;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class OrderService implements ICrud<Order>{
    List<Order> orderList = new ArrayList<>();
    @Override
    public void add(Order order) {

    }

    @Override
    public Order findById(String id) {
        return null;
    }

    @Override
    public Order findById(int id) {
        return null;
    }

    @Override
    public void edit(int id, Order order) {

    }

    @Override
    public void edit(String id, Order order) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public List<Order> findAll() {
        return null;
    }
}
