package org.example.kolosTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Order {


    public Order(List<Ingredient> ingredients, String address, int clientID, OrderStatus orderStatus, int orderID) {
        this.clientID = clientID;
        this.ingredients = ingredients;
        this.address = address;
        this.orderStatus = orderStatus;
        this.orderID = orderID;
    }

    private List<Ingredient> ingredients = new ArrayList<>();

    public String getIngredients() {
//        String s=ingredients.stream().collect(Collectors.joining(", "));
        StringBuilder s= new StringBuilder();
        for (Ingredient ingredient : ingredients) {
            s.append(ingredient.getString()).append(": ").append(ingredient.getInteger()).append("  ");
        }
        return s.toString();
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
    private int orderID;

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }


}
