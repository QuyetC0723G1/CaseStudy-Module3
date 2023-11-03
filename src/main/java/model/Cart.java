package model;

public class Cart {
    private int id;
    private int customerId;
    private String productId;
    private int quantity;
//    private String oderId;
    private boolean deleteFlag;
    private String name;
    private String description;
    private double price;
    String image;
    private double totalMoney;
    private String customerName;

    public Cart(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Cart(int id, int customerId, String productId, int quantity) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
//        this.oderId = oderId;
//        this.deleteFlag = false;
    }

    public Cart(String productImage,int quantity, String name, String description, double price,String customerName) {
        this.quantity = quantity;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = productImage;
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
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

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
//
//    public String getOderId() {
//        return oderId;
//    }
//
//    public void setOderId(String oderId) {
//        this.oderId = oderId;
//    }
}
