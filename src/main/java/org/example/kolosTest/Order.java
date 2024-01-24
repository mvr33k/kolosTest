package org.example.kolosTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Order {


    public Order(List<Ingredient> ingredients, String address, int clientID, OrderStatus orderStatus, int orderID) {
        this.clientID = clientID;
        this.ingredients = ingredients;
        this.address = address;
        this.orderStatus = orderStatus;
        this.orderID = orderID;
    }

    private List<Ingredient> ingredients = new ArrayList<>();

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredient(List<Ingredient> ingredient) {
        this.ingredients = ingredient;
    }


    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String adres) {
        this.address = adres;
    }


    private int clientID;

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }


    private OrderStatus orderStatus;

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
// sprobowac z tego srobic statica ktory sam bedzie obslugiwal zwiekszanie orderID
    private Integer orderID;

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }


}
