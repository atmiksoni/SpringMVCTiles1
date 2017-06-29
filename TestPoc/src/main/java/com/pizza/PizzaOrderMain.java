package com.pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.pizza.PizzaUtil.*;

public class PizzaOrderMain {

	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		// List<PizzaDetail> pizzaDetail = new ArrayList<PizzaDetail>();
		double orderCost = 0;
		for (int i = 0; i < args.length; i++) {
			String pizzaOrder = args[i].replaceAll("\\s+","");
			System.out.println("pizza Order::"+pizzaOrder);
			String[] pizzaInput = pizzaOrder.split("\\|");
			orderCost = orderCost + getTotalCostPerLineItem(pizzaInput);
			System.out.println(pizzaOrder + "::"
					+ getTotalCostPerLineItem(pizzaInput));
			System.out.println("orderCost:: " + orderCost);
		}

		System.out.println("Order Total::" +  Math.floor(orderCost));
		System.out.println("Service Tax (5%) " +  Math.floor(orderCost * 0.05));
		System.out.println("VAT (6%) " +  Math.floor(orderCost * 0.06));
		int total = (int) (+ Math.floor(orderCost)
				+  Math.floor(orderCost * 0.05) +  Math.floor(orderCost * 0.06));
		System.out.println("ToTal::" + total);

	}
}
