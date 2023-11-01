package model;

public class Product {
    private String id;
    private String name;
    private int quantity;
    private double price;
    private String manufacture;
    private int categoryId;
    private String image;
    private String description;
//    private boolean deleteFlag;


    public Product(String id, String name, int quantity, double price, String manufacture,int categoryId,String image,String description) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.manufacture = manufacture;
        this.categoryId = categoryId;
        this.image = image;
        this.description = description;
//        this.deleteFlag = false;
    }


//    public boolean isDeleteFlag() {
//        return deleteFlag;
//    }
//
//    public void setDeleteFlag(boolean deleteFlag) {
//        this.deleteFlag = deleteFlag;
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacture = manufacturer;
    }
}
