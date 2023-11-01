package service;

import model.Customer;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICrud<Customer> {
    List<Customer> customers = new ArrayList<>();
    @Override
    public void add(Customer customer) {

    }

    @Override
    public Customer findById(String id) {
        return null;
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void edit(int id, Customer customer) {

    }

    @Override
    public void edit(String id, Customer customer) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public List<Customer> findAll() {
        return null;
    }
}
