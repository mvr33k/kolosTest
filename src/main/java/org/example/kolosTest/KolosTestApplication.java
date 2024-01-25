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

		List<Ingredient> ingredientList = new ArrayList<>();
		ingredientList.add(new Ingredient("salami",1));
		ingredientList.add(new Ingredient("woda",1));
		orderService.placeOrder(ingredientList, "Lipinki Łużyckie", 12);
		System.out.println(orderService.checkOrderStatus(1));
		System.out.println(orderService.cancelOrder(1));
		System.out.println(orderService.confirmDelivery(1));

		System.out.println("\n\n\n");



		List<Ingredient> ingredientList2 = new ArrayList<>();
		ingredientList2.add(new Ingredient("szklanka",3));
		ingredientList2.add(new Ingredient("stół",5));
		ingredientList2.add(new Ingredient("pilot",12));
		ingredientList2.add(new Ingredient("książka",22));

		orderService.placeOrder(ingredientList2, "Lipinki Łużyckie", 55);
		System.out.println(orderService.checkOrderStatus(2));
		System.out.println(orderService.cancelOrder(2));
		System.out.println(orderService.confirmDelivery(2));




	}

}
