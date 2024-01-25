package org.example.kolosTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class KolosTestApplication {

	private final OrderStorage orderStorage;
	private final OrderService orderService;

	public KolosTestApplication(OrderStorage orderStorage, OrderService orderService){
		this.orderStorage=orderStorage;
		this.orderService=orderService;

		execProcess();
	}

	public static void main(String[] args) {
		SpringApplication.run(KolosTestApplication.class, args);
	}



	public void execProcess() {

		Ingredient ing1=new Ingredient("salami",1);
		Ingredient ing2=new Ingredient("woda",1);
		List<Ingredient> ingredientList = new ArrayList<>();
		ingredientList.add(ing2);
		ingredientList.add(ing1);

		orderService.placeOrder(ingredientList, "Lipinki Łużyckie", 12);
		System.out.println(orderService.checkOrderStatus(1));
		System.out.println(orderService.cancelOrder(1));
		System.out.println(orderService.confirmDelivery(1));

		System.out.println("\n\n\n");

		Ingredient ing3=new Ingredient("szklanka",3);
		Ingredient ing4=new Ingredient("stół",5);
		Ingredient ing5=new Ingredient("pilot",12);
		Ingredient ing6=new Ingredient("książka",22);

		List<Ingredient> ingredientList2 = new ArrayList<>();
		ingredientList2.add(ing3);
		ingredientList2.add(ing4);
		ingredientList2.add(ing5);
		ingredientList2.add(ing6);

		orderService.placeOrder(ingredientList2, "Lipinki Łużyckie", 12);
		System.out.println(orderService.checkOrderStatus(2));
		System.out.println(orderService.cancelOrder(2));
		System.out.println(orderService.confirmDelivery(2));

	}

}
