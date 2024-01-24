package org.example.kolosTest;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ToCheckStatus {
    public ToCheckStatus(List<Ingredient> ingredients,OrderStatus orderStatus) {
        this.ingredients=ingredients;
        this.orderStatus=orderStatus;
    }

    private List<Ingredient> ingredients=new ArrayList<>();
    private OrderStatus orderStatus;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
