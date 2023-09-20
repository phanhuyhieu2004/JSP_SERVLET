package Buoi2;

public class Customer {
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Customer(String name, String sex, String address, String picture) {
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.picture = picture;
    }

    private String address;
    private String picture;


}
