package service;

import model.OrderDetail;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailService implements ICrud<OrderDetail> {
    List<OrderDetail> orderDetailList = new ArrayList<>();
    @Override
    public void add(OrderDetail orderDetail) {

    }

    @Override
    public OrderDetail findById(String id) {
        return null;
    }

    @Override
    public OrderDetail findById(int id) {
        return null;
    }

    @Override
    public void edit(int id, OrderDetail orderDetail) {

    }

    @Override
    public void edit(String id, OrderDetail orderDetail) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public List<OrderDetail> findAll() {
        return null;
    }

}