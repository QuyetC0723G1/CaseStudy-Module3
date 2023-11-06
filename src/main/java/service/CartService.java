package service;

import database.DbConnect;
import model.Cart;
import model.OrderDetail;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartService implements ICrud<Cart> {
    Connection connection = DbConnect.getConnection();
    List<Cart> cartList;

    public CartService() {
    }

    @Override
    public void add(Cart cart) {
        int customerId = 1;
        String productId = "H3G2";
        int quantity = 1;
        String checkProductQuery = "SELECT cart.id, product_quantity FROM cart WHERE customerId = ? AND productId = ? AND deleteflag = 0;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(checkProductQuery);
            preparedStatement.setInt(1, Integer.parseInt("customerId"));
            preparedStatement.setString(2, "productId");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int cartId = resultSet.getInt("id");
                int existingQuantity = resultSet.getInt("quantity");
                int newQuantity = existingQuantity + quantity;

                String updateCart = "UPDATE cart SET quantity = ? WHERE cartId = ? and deleteflag = 0;";
                PreparedStatement update = connection.prepareStatement(updateCart);
                update.setInt(1, Integer.parseInt("quantity"));
                update.setInt(2, Integer.parseInt("id"));
                update.executeUpdate();
            } else {
                String addProductQuery = "INSERT INTO cart (productId, quantity, customerId) VALUES (?, ?, ?)";
                PreparedStatement addCart = connection.prepareStatement(addProductQuery);
                addCart.setInt(1, customerId);
                addCart.setString(2, productId);
                addCart.setInt(3, quantity);
                addCart.executeUpdate();
            }
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addToCart(Cart cart) {
        String addProductQuery = "INSERT INTO cart (productId, customerId) VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(addProductQuery);
            preparedStatement.setString(1, cart.getProductId());
            preparedStatement.setInt(2, cart.getCustomerId());
//            preparedStatement.setInt(3, cart.getQuantity());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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
        String sql = "update cart set deleteflag = 1 where id = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void remove(String id) {
        String sql = "update cart set deleteflag = 1 where id = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, Integer.parseInt(id));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Cart> findAll() {
        return null;
    }

    @Override
    public List<Cart> findByName(String name) {

        return null;
    }

    public List<Cart> findByIdToShowCart(int c_Id) {
        List<Cart> cartList = new ArrayList<>();
        String sql = "select ca.id, p.name as name,p.image as image,c.name as customerName,p.description as description,ca.quantity as quantity, p.price * ca.quantity as price from cart ca\n" +
                "join product p on ca.productId = p.id\n" +
                "join customer c on ca.customerId = c.id\n" +
                "where c.id = ? and ca.deleteflag = 0;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, c_Id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String productName = resultSet.getString("name");
                String description = resultSet.getString("description");
                int quantity = resultSet.getInt("quantity");
                double price = resultSet.getDouble("price");
                String image = resultSet.getString("image");
                String customerName = resultSet.getString("customerName");
                Cart cart = new Cart(id,image, quantity, productName, description, price, customerName);
                cartList.add(cart);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return cartList;
    }

    public double getTotalMoney(int c_id) {
//        List<Cart> cartList = new ArrayList<>();
        double totalMoney = 0;
        String sql = "select sum(ca.quantity*p.price) as totalMoney from cart ca\n" +
                "join product p on ca.productId = p.id\n" +
                "join customer c on ca.customerId = c.id\n" +
                "where c.id = ? and ca.deleteflag = 0;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, c_id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                totalMoney = resultSet.getDouble("totalMoney");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return totalMoney;
    }

}
