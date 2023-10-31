package model;

public class Category {
    private int id;
    private String name;
    private boolean deleteFlag;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
