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

public class ProductService implements ICrud<Product>{
    Connection connection = DbConnect.getConnection();
    List<Product> productList;

    public ProductService() {
    }

    @Override
    public void add(Product product) {
        String sql = "insert into product(id, name,quantity,price, manufacture, categoryId, image, description) values (?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement statement= connection.prepareStatement(sql);
            statement.setString(1,product.getId());
            statement.setString(2,product.getName());
            statement.setInt(3,product.getQuantity());
            statement.setDouble(4,product.getPrice());
            statement.setString(5,product.getManufacturer());
            statement.setInt(6,product.getCategoryId());
            statement.setString(7,product.getImage());
            statement.setString(8,product.getDescription());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Product findById(String id) {
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

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from product;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                int quantity = resultSet.getInt("quantity");
                double price = resultSet.getDouble("price");
                String manufacture = resultSet.getString("manufacture");
                int category = resultSet.getInt("categoryId");
                String image = resultSet.getString("image");
                String description = resultSet.getString("description");
                Product product = new Product(id,name,quantity,price,manufacture,category,image,description);
                list.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

}
