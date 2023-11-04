package service;

import database.DbConnect;
import model.Category;
import model.Product;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryService implements ICrud<Category>{
    List<Category> categoryList = new ArrayList<>();
    Connection connection = DbConnect.getConnection();
    @Override
    public void add(Category category) {

    }

    @Override
    public Category findById(String id) {
        return null;
    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public void edit(int id, Category category) {

    }

    @Override
    public void edit(String id, Category category) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public List<Category> findAll() {
        List<Category> list = new ArrayList<>();
        String sql = "select * from category where deleteflag = 0;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("id"));
                String name = resultSet.getString("name");
                Category category = new Category(id, name);
                list.add(category);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

    @Override
    public List<Category> findByName(String name) {
        return null;
    }
}
