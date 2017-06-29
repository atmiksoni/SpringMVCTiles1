package com.pizza;



public class PizzaUtil {

	public static double getPizzaPriceOnSize(String pizzasize, String pizzaBase) {

		double baseCostFactor = 0.0;
		if ("Large".equalsIgnoreCase(pizzasize)) {
			baseCostFactor = 0.5;
		} else if ("Medium".equalsIgnoreCase(pizzasize)) {
			baseCostFactor = 0.25;
		} else {
			baseCostFactor = 0.0;
		}

		if ("Normal".equalsIgnoreCase(pizzaBase)) {
			return  (75 + baseCostFactor * 75);
		} else if ("Pan".equalsIgnoreCase(pizzaBase)) {
			return (100 + baseCostFactor * 100);
		} else if ("Thin".equalsIgnoreCase(pizzaBase) ){
			return (100 + baseCostFactor * 100);
		} else {
			return  (125 + baseCostFactor * 125);
		}

	}

	public static double getToppicSizeForPizza(String pizzasize, String toppings) {
		{

			String[] topping = toppings.split(",");
			int toppingCount = topping.length;
			if ("Large".equalsIgnoreCase(pizzasize)) {
				return toppingCount * 45;
			} else if ("Medium".equalsIgnoreCase(pizzasize)) {
				return toppingCount * 30;
			} else {
				return toppingCount * 15;
			}

		}

	}

	public static double getCheeseSizeForPizza(String pizzasize, String cheese) {
		{

			String[] cheeses = cheese.split(",");
			if (cheeses.length > 1 && "Double".equalsIgnoreCase(cheeses[1])) {
				if ("Large".equalsIgnoreCase(pizzasize)) {
					return 45;
				} else if ("Medium".equalsIgnoreCase(pizzasize)) {
					return 30;
				} else {
					return 15;
				}
			}
			return 0;
		}

	}
	
	
	public static double getTotalCostPerLineItem(String [] pizzaInput){
		
		
		double baseCost = getPizzaPriceOnSize(pizzaInput[0], pizzaInput[1]);
		double topiggCost = getToppicSizeForPizza(pizzaInput[0], pizzaInput[3]);
		double cheeseCost = getCheeseSizeForPizza(pizzaInput[0], pizzaInput[4]);
		//System.out.println("Pizza cost::" + baseCost);
		//System.out.println("Topping Cost ::" + topiggCost);
		//System.out.println("cheese  Cost ::" + cheeseCost);
		double totalCost = baseCost + topiggCost + cheeseCost;
		//System.out.println("pizzaOrder:::" + totalCost);
		return totalCost;
	}
}
