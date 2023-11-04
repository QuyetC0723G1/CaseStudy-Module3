package service;

import database.DbConnect;
import model.Order;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderService implements ICrud<Order>{
    Connection connection = DbConnect.getConnection();
    @Override
    public void add(Order order) {
        String sql = "insert into `order`(id,customerId) values (?,?) where deleteflag = 0;";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,order.getId());
            statement.setInt(2,order.getCustomerId());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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
        List<Order> list = new ArrayList<>();
        String sql = "select id,customerId,date_registered,totalAmount,status from `order` where deleteflag = 0;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String id = resultSet.getString("id");
                int customerId = resultSet.getInt("customerId");
                Timestamp datetime = resultSet.getTimestamp("date_registered");
                double totalAmount = resultSet.getDouble("totalAmount");
                String status = resultSet.getString("status");
                Order order = new Order(id,customerId,datetime,totalAmount,status);
                list.add(order);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public List<Order> findByName(String name) {

        return null;
    }

}
