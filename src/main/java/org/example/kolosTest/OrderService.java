package org.example.kolosTest;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class OrderService {

    OrderStorage orderStorage = new OrderStorage();

    //    HashMap<String, String> ingredient, String address, clientID
    public void placeOrder(List<Ingredient> ingredient, String address, int clientID) {
        Order order = new Order(ingredient, address, clientID, OrderStatus.NOWE, nextID());
        orderStorage.addOrder(order);
    }

    public String cancelOrder(int orderId) {
        Order order = orderStorage.findOrderById(orderId).orElseThrow();
        order.setOrderStatus(OrderStatus.ANULOWANE);
        return (order.getOrderStatus() + " : " + order.getOrderStatus().getFeedback() + "\n" + "ID zamowienia: " + order.getOrderID() );
    }

    public String confirmDelivery(int orderId) {
        Order order = orderStorage.findOrderById(orderId).orElseThrow();
        order.setOrderStatus(OrderStatus.DOSTARCZONE);
        return (order.getOrderStatus() + "\n" + "ID zamowienia: " + order.getOrderID() );
    }

    // to ma zwracać 2 różne typy
    // Ingredient i status
    public String checkOrderStatus(int orderId) {
        Order order = orderStorage.findOrderById(orderId).orElseThrow();
        return order.getOrderStatus() + " " + order.getIngredients();
//        return new ToCheckStatus(order.getIngredients(), order.getOrderStatus());
    }

    public void changeOrderStatus(int orderId, OrderStatus status) {
        Order order = orderStorage.findOrderById(orderId).orElseThrow();
        order.setOrderStatus(status);
    }


    // czy da się to zrobić jakoś inaczej?
    private int orderID = 0;

    private int nextID() {   // funkcja do zwiekszania id z kolejnymi zamowieniami
        orderID++;
        return orderID;
    }

}
