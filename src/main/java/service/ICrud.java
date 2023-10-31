package service;

public interface ICrud<E> {
     void add(E e);
     E findById(String id);
     E findById(int id);
     void edit(int id, E e);
     void edit(String id, E e);
     void remove(int id);
     void remove(String id);

}
