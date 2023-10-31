package model;

public class Cart {
    private int id;
    private int customerId;
    private String productId;
    private int quantity;
    private String oderId;
    private boolean deleteFlag;

    public Cart(int id, int customerId, String productId, int quantity, String oderId) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
        this.oderId = oderId;
//        this.deleteFlag = false;
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

    public String getOderId() {
        return oderId;
    }

    public void setOderId(String oderId) {
        this.oderId = oderId;
    }
}
