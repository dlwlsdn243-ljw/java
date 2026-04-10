package coffee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import word.Word;

public class EnumEx01 {

	public static void main(String[] args){
		
		// 주문 
		OrderManager om = new OrderManager();
		
		Order order1 = new Order(
				Coffee.AMERICANO,
				Size.LARGE, 
				Arrays.asList(Option.SHOT),
				2
			);
		
		Order order2 = new Order(
				Coffee.LATTE,
				Size.SMALL, 
				Arrays.asList(Option.WHIPPED_CREAM, Option.SHOT),
				2
			);
		
		Order order3 = new Order(
				Coffee.MOCHA,
				Size.LARGE, 
				Arrays.asList(Option.WHIPPED_CREAM, Option.SYRUP),
				1
			);
		
		om.addOrder(order1);
		om.addOrder(order2);
		om.addOrder(order3);
		
		om.printAllOrders();
		
		System.out.println("총 매출 : " +om.getTotalSales() + "원");

	}

}