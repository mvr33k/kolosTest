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
		orderService.cancelOrder(1);


	}

}
