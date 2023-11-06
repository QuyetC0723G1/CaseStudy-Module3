package model;

public class Customer {
    private int id;
    private String name;
    private int age;
    private String address;
    private String email;
    private int userId;
    private boolean deleteFlag;

    public Customer(int id, String name, int age, String address, String email, int userId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.userId = userId;
//        this.deleteFlag = false;
    }

    public Customer(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public Customer(String name, int age, String address, String email, int userId) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.userId = userId;
    }
    //    public boolean isDeleteFlag() {
//        return deleteFlag;
//    }
//
//    public void setDeleteFlag(boolean deleteFlag) {
//        this.deleteFlag = deleteFlag;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
