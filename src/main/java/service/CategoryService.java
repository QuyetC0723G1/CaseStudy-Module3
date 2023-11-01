package service;

import model.Category;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class CategoryService implements ICrud<Category>{
    List<Category> categoryList = new ArrayList<>();
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
        return null;
    }
}
