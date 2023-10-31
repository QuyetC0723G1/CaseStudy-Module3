package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements ICrud<Product>{
    List<Product> productList = new ArrayList<>();

    public ProductService() {
    }

    @Override
    public void add(Product product) {
        productList.add(product);
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
}
