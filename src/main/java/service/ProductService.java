package service;

import database.DbConnect;
import model.Product;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements ICrud<Product> {
    Connection connection = DbConnect.getConnection();
    List<Product> productList;

    public ProductService() {
    }

    @Override
    public void add(Product product) {
        String sql = "insert into product(id, name,quantity,price, manufacture, categoryId, image, description) values (?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, product.getId());
            statement.setString(2, product.getName());
            statement.setInt(3, product.getQuantity());
            statement.setDouble(4, product.getPrice());
            statement.setString(5, product.getManufacture());
            statement.setInt(6, product.getCategoryId());
            statement.setString(7, product.getImage());
            statement.setString(8, product.getDescription());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product findById(String id) {
        String sql = "select * from product where id =?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                id = resultSet.getString("id");
                String name = resultSet.getString("name");
                int quantity = resultSet.getInt("quantity");
                double price = resultSet.getDouble("price");
                String manufacture = resultSet.getString("manufacture");
                int categoryId = resultSet.getInt("categoryId");
                String image = resultSet.getString("image");
                String description = resultSet.getString("description");
                return new Product(id, name, quantity, price, manufacture, categoryId, image, description);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void edit(int id, Product product) {

    }

    @Override
    public void edit(String id, Product product) {
        String sql = "update product set id = ?, name = ?, quantity = ?,  price = ?, manufacture = ?, categoryId = ?, image = ? , description =? where  id = ? and deleteflag = 0;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setDouble(4, product.getPrice());
            preparedStatement.setString(5, product.getManufacture());
            preparedStatement.setInt(6, product.getCategoryId());
            preparedStatement.setString(7, product.getImage());
            preparedStatement.setString(8, product.getDescription());
            preparedStatement.setString(9, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void remove(String id) {
        String sql = "update product set deleteflag = 1 where id = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from product where deleteflag = 0;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                int quantity = resultSet.getInt("quantity");
                double price = resultSet.getDouble("price");
                String manufacture = resultSet.getString("manufacture");
                int category = resultSet.getInt("categoryId");
                String image = resultSet.getString("image");
                String description = resultSet.getString("description");
                Product product = new Product(id, name, quantity, price, manufacture, category, image, description);
                list.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    @Override
    public List<Product> findByName(String nameOut) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from product where name like ? and deleteflag = 0;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, '%' + nameOut + '%');
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                int quantity = resultSet.getInt("quantity");
                double price = resultSet.getDouble("price");
                String manufacture = resultSet.getString("manufacture");
                int category = resultSet.getInt("categoryId");
                String image = resultSet.getString("image");
                String description = resultSet.getString("description");
                Product product = new Product(id, name, quantity, price, manufacture, category, image, description);
                list.add(product);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<Product> findByPrice(double priceMin, double priceMax) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from product where deleteflag = 0 and price between ? and ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDouble(1, priceMin);
            preparedStatement.setDouble(2, priceMax);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                int quantity = resultSet.getInt("quantity");
                double price = resultSet.getDouble("price");
                String manufacture = resultSet.getString("manufacture");
                int category = resultSet.getInt("categoryId");
                String image = resultSet.getString("image");
                String description = resultSet.getString("description");
                Product product = new Product(id, name, quantity, price, manufacture, category, image, description);
                list.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }


}
