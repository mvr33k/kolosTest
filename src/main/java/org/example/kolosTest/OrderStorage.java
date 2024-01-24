package org.example.kolosTest;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.*;

@Component
public class OrderStorage {
//    private int orderID;
//    private int clientID;
    private List<Order> orderList = new ArrayList<>();



    public void addOrder(Order order){
        orderList.add(order);
    }

    public Optional<Order> findOrderById(int orderId) {
        return getAll().stream()
                .filter(order -> order.getOrderID().equals(orderId))
                .findFirst();
    }

    private List<Order> getAll() {
        return orderList;
    }

//  Ogarnij żeby to faktycznie coś pokazywało. obiekt powstaje i niby coś w nim jest ale użycie toString w maine daje pustą tablice

}
