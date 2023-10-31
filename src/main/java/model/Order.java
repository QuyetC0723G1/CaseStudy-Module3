package model;

import java.time.LocalDate;

public class Order {
    private String id;
    private int customerId;
    private LocalDate date;
    private int totalAmount;
    private int status;
    private boolean deleteFlag;

    public Order(String id, int customerId, LocalDate date, int totalAmount, int status) {
        this.id = id;
        this.customerId = customerId;
        this.date = date;
        this.totalAmount = totalAmount;
        this.status = status;
//        this.deleteFlag = false;
    }

//    public boolean isDeleteFlag() {
//        return deleteFlag;
//    }
//
//    public void setDeleteFlag(boolean deleteFlag) {
//        this.deleteFlag = deleteFlag;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
