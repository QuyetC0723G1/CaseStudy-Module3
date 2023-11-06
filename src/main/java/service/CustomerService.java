package service;

import database.DbConnect;
import model.Customer;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICrud<Customer> {
    Connection connection = DbConnect.getConnection();
    List<Customer> customers = new ArrayList<>();
    @Override
    public void add(Customer customer) {
        String sql = "insert into customer(name,age,address, email, userId) values (?,?,?,?,?);";
        try {
            PreparedStatement statement= connection.prepareStatement(sql);
            statement.setString(1,customer.getName());
            statement.setInt(2,customer.getAge());
            statement.setString(3,customer.getAddress());
            statement.setString(4,customer.getEmail());
            statement.setInt(5,customer.getUserId());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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

    @Override
    public List<Customer> findByName(String name) {
        return null;
    }

    public Customer getCustomerByUserId(int userId){
        String sql = "select * from Customer where userId = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,userId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                return new Customer(id,name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }return null;
    }
}
